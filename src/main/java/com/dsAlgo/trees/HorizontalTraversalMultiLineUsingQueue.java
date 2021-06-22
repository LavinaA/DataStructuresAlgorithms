package com.dsAlgo.trees;

import java.util.Deque;
import java.util.LinkedList;

public class HorizontalTraversalMultiLineUsingQueue {
    public static void main(String[] args) {
        Node t1 = new Node(20);
        Node t2 = new Node(10);
        Node t3 = new Node(30);
        Node t4 = new Node(15);
        Node t5 = new Node(25);
        Node t6 = new Node(35);
        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        t2.left = t6;
        t3.left = t5;

        Deque<Node> queue1 = new LinkedList<Node>();
        Deque<Node> queue2 = new LinkedList<Node>();

        horizontalTraversalMultiLineUsingQueue(queue1,queue2,t1);

    }
    private static void horizontalTraversalMultiLineUsingQueue(Deque<Node> queue1, Deque<Node> queue2, Node t1) {

        Node root = t1;

        queue1.addFirst(root);

        while (!queue1.isEmpty() || !queue2.isEmpty()) {

            while (!queue1.isEmpty()) {
                Node firstelement = queue1.removeFirst();
                System.out.print(firstelement.data);
                System.out.print(" ");

                if (firstelement.left != null) {
                    queue2.addLast(firstelement.left);
                }
                if(firstelement.right!=null){
                queue2.addLast(firstelement.right);}
            }
            System.out.println();

            while (!queue2.isEmpty()) {
                Node firstelement1 = queue2.removeFirst();
                System.out.print(firstelement1.data);
                System.out.print(" ");

                if(firstelement1.left!=null){
                queue1.addLast(firstelement1.left);
                }
                if(firstelement1.right!=null){
                queue1.addLast(firstelement1.right);
                }
            }
            System.out.println();
        }
    }
}

