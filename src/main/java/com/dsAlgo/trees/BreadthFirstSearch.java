package com.dsAlgo.trees;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        Node t1 = new Node(10);
        Node t2 = new Node(20);
        Node t3 = new Node(30);
        Node t4 = new Node(40);
        Node t5 = new Node(50);
        Node t6 = new Node(60);
        Node t7 = new Node(70);
        Node t8 = new Node(80);
        Node t9 = new Node(90);
        Node t10 = new Node(100);
        Node t11 = new Node(110);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t5.left = t8;
        t5.right = t9;
        t7.left = t10;
        t7.right = t11;

        bfsTraversal(t1);
    }

    private static void bfsTraversal(Node t1) {

        Deque<Node> queue1 = new LinkedList<>();

        Node root = t1;
        queue1.addLast(root);
        root.visited = true;

        while (!queue1.isEmpty()) {
            Node n = queue1.removeFirst();
            System.out.print(n.data);
            System.out.print(" ");
            while(true) {
                Node n1 = getAdjacentNode(n);
                if (n1 == null) {
                    break;
                }
                n1.visited = true;
                queue1.addLast(n1);
            }
        }
    }
    private static Node getAdjacentNode(Node n) {

        if (n.left != null && n.left.visited == false) {
            return n.left;
        }
        if (n.right != null && n.right.visited == false) {
            return n.right;
        }
        return null;
    }
}