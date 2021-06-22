package com.dsAlgo.trees;

import java.util.Stack;

public class DepthFirstSearch {

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

        depthFirstTraversal(t1);
}

    private static void depthFirstTraversal(Node t1) {
        Node root = t1;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        root.visited = true;
        System.out.println(root.data);
        while(!stack.isEmpty()){
            Node n = getAdjacentNode(stack.peek());
            if (n == null) {
                stack.pop();
            }
            else {
                n.visited = true;
                System.out.println(n.data);
                stack.push(n);
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
