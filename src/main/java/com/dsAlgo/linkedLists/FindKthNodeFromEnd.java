package com.dsAlgo.linkedLists;

public class FindKthNodeFromEnd {
    public static void main(String[] args) {
        Link l1 = new Link(1);
        Link l2 = new Link(2);
        Link l3 = new Link(3);
        Link l4 = new Link(4);
        Link l5 = new Link(5);
        Link l6 = new Link(6);
        Link l7 = new Link(7);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        System.out.println("The kth node from end using method1 " + FindKthNodeFromEnd1(l1,5));
        System.out.println("The kth node from end using method1 " + FindKthNodeFromEnd1(l1,0));
        System.out.println("The kth node from end using method1 " + FindKthNodeFromEnd1(l1,1));
        System.out.println("The kth node from end using method2 " + FindKthNodeFromEnd2(l1,5));
        System.out.println("The kth node from end using method2 " + FindKthNodeFromEnd2(l1,0));
        System.out.println("The kth node from end using method2 " + FindKthNodeFromEnd2(l1,1));


    }

    //Move the runner pointer the difference number of times .For eg len =10 ,find 4th element from last
    //(10-4) = 6 times .Move runner pointer 6 times.
    // Again iterate on runner pointer till it reaches end and move current pointer forward to point to kth node from end

    private static int FindKthNodeFromEnd2(Link head, int i) {

        if (head == null || i == 0) {
            return -1;
        }
        Link runner = head;
        Link current = head;

        while (i > 1) {
            runner = runner.next;
            i--;
        }
        while (runner.next != null) {
            current = current.next;
            runner = runner.next;
        }
        return (current.id);

    }

    //The kth node is equal to (length-k+1) from start
    // length =10 , find 6th node from end ,(10-6+1) = 5th node from start
    
    public static int FindKthNodeFromEnd1(Link head,int k){

        if (head == null || k == 0) {
            return -1;
        }
        Link current = head;
        int len = 0;
        while (current != null) {
            len++;
            current = current.next;
        }
        current = head;
        for (int i = 1; i < len - k + 1; i++) {
            current = current.next; 
        }
        return (current.id);
    }
}
