package com.dsAlgo.strings;

//How to remove characters from the first String which are present in the second String
//UsingStringBuilder Class beacuse it has deleteCharAt function

public class RemovecharsInFirstStringPresentInSecondString {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("LavinaAgybmh");
        String s2 = "bombay";

        removechars(s1,s2);
    }

    private static void removechars(StringBuilder s1, String s2) {
        for(int i=0;i<s2.length();i++){
            Character ch = s2.charAt(i);

            for(int j = 0;j<s1.length();j++){

                if(s1.charAt(j)==ch){
                    s1=s1.deleteCharAt(j);

                }

            }
        }

        System.out.println(s1);




    }
}
