package com.dsAlgo.trees;

import java.util.Deque;
import java.util.LinkedList;

public class HorizontalTraversalSingleLineUsingQueue {
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
        horizontaltraversalSingleLineUsingQueue(queue1,t1);

    }

    private static void horizontaltraversalSingleLineUsingQueue(Deque<Node> queue1,Node t1) {

        Node root = t1;

        queue1.addFirst(root);

        while(!queue1.isEmpty()){
            Node firstelement = queue1.removeFirst();
            System.out.print(firstelement.data);
            System.out.print(" ");
            if(firstelement.left!=null) {
                queue1.addLast(firstelement.left);}
            if(firstelement.left!=null){
                queue1.addLast(firstelement.right);}
            }

        }

    }


