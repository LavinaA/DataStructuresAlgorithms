package com.dsAlgo.strings;
/*
i/p -My name is Ravi
o/p - 1) yM eman si ivaR
      2)Ravi is name My
      3)ivaR si eman yM
 */


public class ReverseStringsDifferentCombinations {
    public static void main(String[] args) {
        String s = "My name is Ravi";
        System.out.println(reverseOutput3(s));
        System.out.println(reverseOutput2(s));
        System.out.println(reverseOutput1(s));
    }

    public static String reverseOutput3(String s) {
        String[] str = s.split(" ");
        String res = " ";
        for (int i = 0; i <= str.length - 1; i++) {
            String temp = str[i];
            String rev = " ";

            for (int j = str[i].length() - 1; j >= 0; j--) {
                rev = rev + temp.charAt(j);
            }
            res = rev + res;
        }
        return res;
    }

    public static String reverseOutput2(String s) {

        String[] str = s.split(" ");
        String res = " ";
        for (int i = 0; i <= str.length - 1; i++) {
            String temp = str[i];
            String rev = " ";

            for (int j = 0; j <= str[i].length() - 1; j++) {
                rev = rev + temp.charAt(j);
            }
            res = rev + res;
        }
        return res;
    }

    public static String reverseOutput1(String s) {
        String res = " ";
        String[] str = s.split(" ");
        for (int i = 0; i <= str.length - 1; i++) {
            String temp = str[i];
            String rev = " ";

            for (int j = str[i].length() - 1; j >= 0; j--) {
                rev = rev + temp.charAt(j);
            }
            res = res + rev;
        }
        return res;
    }
}
