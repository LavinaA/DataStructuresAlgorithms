package com.dsAlgo.linkedLists;

public class Link {
    public int id;
    public Link next;

    public Link(int id) {
        this.id = id;
    }
    public void displayLink(){
        System.out.print( "{" + id + ", " + "} -> ");
    }
}
