package com.dsAlgo.strings;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FindDuplicateCharInString {
    public static void main(String[] args) {
        String str = "LavinaL";
        findDuplicateChar(str);
    }

    private static void findDuplicateChar(String str) {
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<str.length();i++) {
            Character c = str.charAt(i);

            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for(Map.Entry<Character,Integer> m: map.entrySet()){
            //System.out.print(m.getKey()+ " ");
            //System.out.println(m.getValue());
            if(m.getValue() >=2){
                System.out.println("The duplicate values ina string are "+m.getKey());
            }
        }



    }
}
