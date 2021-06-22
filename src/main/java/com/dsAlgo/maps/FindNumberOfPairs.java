package com.dsAlgo.maps;

/*
Program to find pair of numbers in a particular array
i/p -> {1,1,4,5,3,4}
o/p-> 1 pair of 1 ,1 pair of 4
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindNumberOfPairs {
    public static void main(String[] args) {
        //int arr[] = {1,1,4,5,3,4,5,5};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (Integer i : arrayList) {
            if (map.get(i) == null) {
                map.put(i, 1);
            } else
                map.put(i, map.get(i) + 1);
        }
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            if (m.getValue() > 1) {
                System.out.println("The integer " + m.getKey() + " appears " + m.getValue() + " times");
            }
        }
    }
}

