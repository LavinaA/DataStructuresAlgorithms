package com.dsAlgo.trees;

//import sun.swing.StringUIClientPropertyKey;

public class OneTreeSubtreeOfAnother {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.left = n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n5.left=n6;
        n5.right=n7;

        Node t2 = new Node(2);
        Node t4 = new Node(4);
        Node t5 = new Node(5);
        Node t6 = new Node(6);
        Node t7 = new Node(7);

        t2.left=t4;
       t2.right=t5;
        t5.left=t6;
        t5.right=t7;

        boolean b = isSubtree(n1,t2);
        if (b == true) {
            System.out.println("The second tree is subtree of another tree");
        } else if (b == false) {
            System.out.println("The second tree is not suubtree of another tree");
        }
    }

    private static boolean isSubtree(Node n1, Node n2) {

        if(n2==null){
            return true;

        }
       else if(n1==null){
            return false;
        }

       else  if ((n1.data == n2.data) && matchTree(n1,n2) ){
            return true;
        }

return isSubtree(n1.left,n2) || isSubtree(n1.right,n2);

    }

    private static boolean matchTree(Node n1, Node n2) {
        if(n1==null && n2 == null){
            return true;
        }
        else if ( n1 == null || n2 == null){
            return false;
        }
        else if (n1.data != n2.data){
            return false;
        }
       else {
            return (matchTree(n1.left, n2.left)) && (matchTree(n1.right, n2.right));
        }
    }
}
