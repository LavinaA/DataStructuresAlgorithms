package com.dsAlgo.strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Lavina";
        String str = reverseWithoutExtraSpace(s);
        String str1 = reverseWithExtraSpace(s);
        System.out.println("The reverse of a string without using extra space " + s + " is " + str);
        System.out.println("The reverse of a string with extra space " + s + " is " + str1);
        System.out.println("The reverse of a string with extra space " + s + " is " + reverseWithoutExtraSpace("Ravi Agrawal"));
        //System.out.println(reverseWithExtraSpace("Aadya"));
    }
    public static String reverseWithoutExtraSpace(String s){

        if (s == null || s.length() == 0) {
            return "";
        }
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        String s1 = new String(ch);
        return s1;
    }
    public static String reverseWithExtraSpace(String s){
        if (s==null || s.length()==0) {
            return "";
        }
        String res = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }
        return res;
    }
}
