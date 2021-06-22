package com.dsAlgo.strings;

public class SortStringLexicographicalOrder {
    public static void main(String[] args) {

        String str[] = {"C","Java","Computer","Python","Ice Cream","Jaba","Aron"};
        String [] s =sortStringLexicographicalOrder1(str);
        for (int i = 0; i <= s.length - 1; i++) {
            System.out.println(s[i]);
        }
    }
    public static String[]  sortStringLexicographicalOrder1(String [] str){
        for (int i = 0; i <= str.length - 2; i++) {
            for (int j = i + 1; j <= str.length - 1; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        return str;
    }
}
