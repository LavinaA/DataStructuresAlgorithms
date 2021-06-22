package com.dsAlgo.trees;

import java.util.Stack;

public class ZigZagTraversal {
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

        zigzagTraversal_1(t1);
        System.out.println("****************************");
        zigzagTraversal_2(t1);

    }

    private static void zigzagTraversal_2(Node t1) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        Node root =t1;
        stack1.push(t1);

        while(!stack1.isEmpty() || !stack2.isEmpty()) {

            while (!stack1.isEmpty()) {
                Node firstElement = stack1.pop();
                System.out.print(firstElement.data);
                System.out.print(" ");

                if (firstElement.right != null) {
                    stack2.push(firstElement.right);}
                if(firstElement.left != null ){
                    stack2.push(firstElement.left);}

            }

            System.out.println();

            while (!stack2.isEmpty()){
                Node firstElement = stack2.pop();
                System.out.print(firstElement.data);
                System.out.print(" ");

                if (firstElement.left != null) {
                    stack1.push(firstElement.left);}
                if(firstElement.right != null ){
                    stack1.push(firstElement.right);}

            }
            System.out.println();
        }
    }

    private static void zigzagTraversal_1(Node t1) {

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        Node root =t1;
        stack1.push(t1);

        while(!stack1.isEmpty() || !stack2.isEmpty()) {

            while (!stack1.isEmpty()) {
                Node firstElement = stack1.pop();
                System.out.print(firstElement.data);
                System.out.print(" ");

                if (firstElement.left != null) {
                    stack2.push(firstElement.left);}
                if(firstElement.right != null ){
                    stack2.push(firstElement.right);}

                }

            System.out.println();

            while (!stack2.isEmpty()){
                Node firstElement = stack2.pop();
                System.out.print(firstElement.data);
                System.out.print(" ");

                if (firstElement.right != null) {
                    stack1.push(firstElement.right);}
                if(firstElement.left != null ){
                    stack1.push(firstElement.left);}

            }
            System.out.println();
        }
    }
}


