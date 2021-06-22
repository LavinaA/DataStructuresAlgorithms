package com.dsAlgo.linkedLists;

import java.util.HashSet;
import java.util.Set;

public class LoopLinkList {
    public static void main(String[] args) {
        Link l1=new Link(1);
        Link l2=new Link(1);
        Link l3=new Link(1);
        Link l4=new Link(1);
        Link l5=new Link(1);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l3;

        if(checkIfLoopPresent(l1)){
            System.out.println("Loop Present");
        }
        else{
            System.out.println("Loop not present");
        }
    }

    private static Boolean checkIfLoopPresent(Link l1) {

        Link current = l1;
        Set<Link> set = new HashSet<Link>();

        while (current != null) {

            if (set.contains(current)) {
                return true;
            } else {
                set.add(current);
            }
            current = current.next;
        }
        return false;
    }
}
