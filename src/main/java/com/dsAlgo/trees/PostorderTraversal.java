package com.dsAlgo.trees;

public class PostorderTraversal {
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

        postorderTraversal(t1);
    }

    private static void postorderTraversal(Node n) {
        if (n == null) {
            return;
        }
        postorderTraversal(n.left);
        postorderTraversal(n.right);
        n.displayNode();

    }
}
