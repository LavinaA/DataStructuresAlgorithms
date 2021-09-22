package com.dsAlgo.trees;

//Check if two trees are mirror images of each other

public class TwoTreesMirrorImages {
    public static void main(String[] args) {
        Node t1 = new Node(1);
        Node t2 = new Node(2);
        Node t3 = new Node(3);
        Node t4 = new Node(4);
        Node t5 = new Node(5);
        Node t6 = new Node(6);

        t1.left = t3;
        t1.right=t2;
        t2.left = t5;
        t2.right=t4;
        //t3.left=t6;


        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right = n5;
        n3.right=n6;

        Boolean b = mirror(t1,n1);
        if (b == true) {
            System.out.println("The two trees are mirror images of each other");
        } else if (b == false) {
            System.out.println("The two trees are not mirror images");
        }

    }

    private static boolean mirror(Node t1, Node n1) {

        if(t1==null && n1==null){
            return true;
        }
        if(t1==null || n1==null){
            return false;
        }
        //both are not null
        if (t1.data!=n1.data) {
            return false;
        }

        return(mirror(t1.left,n1.right) && mirror(t1.right,n1.left));
    }
}
