package com.dsAlgo.linkedLists;

public class MiddleElementLinkList {
    public static void main(String[] args) throws Exception {
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
        System.out.println("The middle element of link list " +findMiddleElementMethod1(l1));
        System.out.println("The middle element of link list when only 1 node is present "+findMiddleElementMethod1(l7));
        System.out.println("The middle element of link list when 0 node present "+findMiddleElementMethod1(null));

        System.out.println("The middle element of link list "+findMiddleElementMethod2(l1));
        System.out.println("The middle element of link list when only 1 node is present "+findMiddleElementMethod2(l7));
        System.out.println("The middle element of link list when only 1 node is present "+findMiddleElementMethod2(null));

    }

    private static int findMiddleElementMethod2(Link head) {
       // Link current = head;
        if (head == null) {
            return -1;
        }
        Link fast = head;
        Link slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return (slow.id);
    }


    private static int findMiddleElementMethod1(Link head) throws Exception {
        Link current = head;
        int count = 0;

        //0 node present or node is null
        if (head == null) {
            return -1;
        }

        while (current != null) {
            count++;
            current = current.next;
        }
        int j = count/2+1;
        int count1 = 0;
        current = head;
        while (current != null) {
            count1++;

            if (count1 == j) {
                return (current.id);
            }
            current = current.next;
        }
        return -1;
    }
}
