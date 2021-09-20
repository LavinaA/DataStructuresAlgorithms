package com.dsAlgo.trees;

public class InsertElementTree {
    public static void main(String[] args) {

        Node t1 = new Node(20);
        Node t2 = new Node(10);
        Node t3 = new Node(30);
        Node t4 = new Node(15);
        Node t5 = new Node(25);
        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        t3.left = t5;

        insertElement(t1,35);
        System.out.println("Inorder");
        inorderTraversal(t1);

    }

    private static void insertElement(Node root, int key) {
        Node current = root;
        Node newnode = new Node(35);
        if(current == null){
            newnode = current;
        }

        while(current!=null){
            if(key>current.data) {
                current = current.right;
                if (current.right == null) {
                    current.right = newnode;
                    return;
                } else if (key < current.data) {
                    current = current.left;
                    if (current.left == null) {
                        current.left = newnode;
                        return;
                    }
                }
            }
        }

    }

    private static void inorderTraversal(Node t1) {
        if(t1==null){
            return;
        }
        inorderTraversal(t1.left);
        System.out.println(t1.data);
        inorderTraversal(t1.right);
    }
}

