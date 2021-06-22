package com.dsAlgo.maps;
/*
i/p-> arr = {god,eat,tea,dog}
o/p-> god ,dog ,eat,tea

sort entries of input array - { dgo,aet,aet,dgo}
 */

import java.util.*;

public class GroupingEntriesInMaps {
    public static void main(String[] args) {

        String arr[] = {"god", "eat", "tea", "dog"};
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        //List<String> list = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            String key = getSortedKey(arr[i]);

            if (map.get(key) == null) {
                List<String> list = new ArrayList<String>();
                list.add(arr[i]);
                map.put(key, list);
            } else {
                List l = map.get(key);
                l.add(arr[i]);
            }
        }
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "," + m.getValue());
        }
    }
    private static String getSortedKey(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        //System.out.println(ch);
        String str = new String(ch);
        return str;
    }

}
