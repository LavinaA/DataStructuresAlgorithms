package com.dsAlgo.strings;

/*
Find occurrence of string ello in string "HelloWorld"
 */

public class FindoccurrenceOfString {
    public static void main(String[] args) {
        String s1 = "HellWorldello";
        String s2 = "ello";

        Boolean b = findOccurrenceOfString(s1,s2);
        System.out.println(b);

    }

    private static Boolean findOccurrenceOfString(String s1, String s2) {
        for (int i = 0; i <= (s1.length() - s2.length()); i++) {
            if(s1.charAt(i)!=s2.charAt(0)){
                continue;
            }
            else{

                int temp = i;
                int j = 0;
                for (; j <= s2.length() - 1; j++) {
                    if (s2.charAt(j) == s1.charAt(temp)) {
                        temp++;
                    }
                    else {
                        break;
                    }
                }
                if (j == s2.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
