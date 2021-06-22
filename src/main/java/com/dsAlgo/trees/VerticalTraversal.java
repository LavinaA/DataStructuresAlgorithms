package com.dsAlgo.trees;

import java.util.*;

public class VerticalTraversal {
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

        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        verticalTraversal(t1,map,1);

        for (Map.Entry<Integer,List<Integer>> m: map.entrySet()) {
            System.out.println(m.getValue());
        }
    }

    private static void verticalTraversal(Node n, Map<Integer, List<Integer>> map,Integer level) {
        if (n == null) {
            return;
        }
        if (map.get(level) == null) {
            List<Integer> l1 = new ArrayList<Integer>();
            l1.add(n.data);
            map.put(level,l1);
        }
        else {
            map.get(level).add(n.data);
        }

        verticalTraversal(n.left,map,level-1);
        verticalTraversal(n.right,map,level+1);

    }

}
