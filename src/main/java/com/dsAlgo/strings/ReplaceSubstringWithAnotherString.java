package com.dsAlgo.strings;

public class ReplaceSubstringWithAnotherString {
    public static void main(String[] args) {
        String str = "The girl lives in Banglore city in an apartment";
        String toBeReplaced = "in";
        String toBeReplacedWith = "into";
//Approach 1
        System.out.println(replaceSubstringWithAnotherStringFun(str,toBeReplaced,toBeReplacedWith));
//Approach 2
        System.out.println(replaceSubstringWithAnotherStringFun1(str,toBeReplaced,toBeReplacedWith));
    }
    public static String replaceSubstringWithAnotherStringFun(String s,String toBeReplaced,String toBeReplacedWith){
        String[] str = s.split(" ");
        String res =" ";
        for (int i = 0; i <= str.length - 1; i++) {
            if (str[i].equals(toBeReplaced)) {
                res = res + toBeReplacedWith + " ";
            } else {
                res = res + str[i] + " ";
            }
        }
        res=res.substring(0,res.length()-1);
        return res;
    }

    public static String replaceSubstringWithAnotherStringFun1(String s, String toBeReplaced, String toBeReplacedWith) {

        String[] str = s.split(toBeReplaced);
        String res = "";
        char ch = ' ';
        for (int i = 0; i <= str.length - 1; i++) {

            res = res + str[i]+ toBeReplacedWith + " ";

        }
        res = res.substring(0, res.length()-1 - toBeReplacedWith.length());
        return res;

    }
}
