package com.dsAlgo.linkedLists;
/*
Check if 2 linked lists intersect with each other and find the intersection point if they intersect with each other
 */
public class FindIntersectionNodeIfPresent {
    public static void main(String[] args) {
        Link l1 = new Link(1);
        Link l2 = new Link(2);
        Link l3 = new Link(7);
        Link l4 = new Link(6);
        Link s1 = new Link(5);
        Link s2 = new Link(9);
        Link s3 = new Link(8);
        Link s4 = new Link(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        //s4.next = l2;


        Link intersectionNode =findIntersectionNodeIfPresent(l1, s1);
        if(intersectionNode==null){
            System.out.println("The two linked lists do not intersect each other");
        }
        else{
            System.out.println(intersectionNode.id);
        }
    }

    private static Link findIntersectionNodeIfPresent(Link l1, Link l2) {
        int lengthl1 = 0;
        int lengthl2 = 0;
        Link currentl1 = l1;
        Link currentl2 = l2;

        while (currentl1.next != null) {
            lengthl1++;
            currentl1 = currentl1.next;
        }

        while (currentl2.next != null) {
            lengthl2++;
            currentl2 = currentl2.next;
        }

        if (currentl1 == currentl2) {
            int diff = 0;
            System.out.println("The linked lists intersect each other");
            if (lengthl1 > lengthl2) {
                diff = lengthl1 - lengthl2;

                while (diff > 0) {
                    l1 = l1.next;
                    diff--;
                }


            } else if (lengthl2 > lengthl1) {
                diff = lengthl2 - lengthl1;

                while (diff > 0) {
                    l2 = l2.next;
                    diff--;
                }

            }
        } else {
            //System.out.println("The two linked lists do not intersect each other");
            return null;
        }
            while (l1 != null) {
                l1 = l1.next;
                l2 = l2.next;
                if (l1 == l2) {
                    return l1;
                }
            }
        return null;
    }
}
