package com.dsAlgo.trees;

public class Node {
    int data;
    Node left;
    Node right;
    boolean visited;


    public Node(int data){
        this.data = data;

    }
    public void displayNode(){
        System.out.println(data);
    }
}
