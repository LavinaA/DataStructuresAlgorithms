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

    }

    private static void insertElement(Node root, int key) {
        Node current = root;
        Node newNode = new Node(key);
        if (root == null) {
            newNode = root;
        }
        else{
            while (true) {
                Node parent = current;
                if (key < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else if (key > current.data) {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
}
