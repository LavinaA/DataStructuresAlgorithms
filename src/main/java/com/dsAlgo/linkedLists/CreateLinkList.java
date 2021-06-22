package com.dsAlgo.linkedLists;

public class CreateLinkList {
    public static void main(String[] args) {
        Link l1 = new Link(1);
        Link l2 = new Link(2);
        Link l3 = new Link(3);
        Link l4 = new Link(4);
        Link l5 = new Link(5);

        l1.next = l2 ;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        displayList(l1);
    }
    public static void displayList(Link node){
      Link current = node;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}
