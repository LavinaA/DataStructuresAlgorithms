package com.dsAlgo.strings;
/*
Check if string is panagram or not (means it conatins all 26 letters of English
 */

import java.util.HashSet;
import java.util.Set;


public class Panagram {
    public static void main(String[] args) {
        String str = "AbcadefghijkLmnopqrstuvVwxyZ";
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set);
        if (set.size() >= 26) {
            System.out.println("the given string is a panagram");
        } else {
            System.out.println("The given string is not a panagram");
        }
    }

}
