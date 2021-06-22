package com.dsAlgo.trees;

public class SearchElementBinaryTree {

    public static void main(String[] args) {
        //This is a Binary Search Tree
       Node t1 = new Node(20);
       Node t2 = new Node(10);
       Node t3 = new Node(30);
       Node t4 = new Node(15);
       Node t5 = new Node(25);
        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        t3.left = t5;

        Node node = searchElementTree(t1,28);
        if (node == null) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
            node.displayNode();
        }
    }

    public static Node searchElementTree(Node root, int key){
       Node current = root;
        while (current != null) {
            if (key < current.data) {
                current = current.left;
            } else if (key > current.data) {
                current = current.right;
            } else if(key == current.data){
                return current;
            }
            if (current == null) {
                return null;
            }
        }
        return null;
    }

}
