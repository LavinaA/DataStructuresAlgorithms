package com.dsAlgo.maps;

import java.util.*;
//Program to understand the logic to sort Map based on Value
//This program will not work to find the second most freq char in string
//This program is just to have an understanding for how to create list of Maps,sort on list<Map.Entry> using comparator

public class findsecondfreqCharacterInString {
    public static void main(String[] args) {
        String s = "MADAM";
        List<Map.Entry<Character, Integer>> list = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();
        int value = 1;
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), 1);
            } else
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        for (Map.Entry<Character, Integer> ma : map.entrySet()) {
            list.add(ma);
        }

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if (o1.getValue().compareTo(o2.getValue()) > 0) {
                    return -1;
                } else  if (o1.getValue().compareTo(o2.getValue()) < 0) {
                    return 1;
                } else {
                    return 0;
                }

            }
        });

       /* Map.Entry<Character, Integer> secondmax = list.get(1);
        System.out.println(secondmax.getKey()+ " --> " +secondmax.getValue());*/
        for(Map.Entry<Character, Integer> entryList : list){
            System.out.println(entryList.getKey() + "-> "+entryList.getValue());
        }
    }
}
