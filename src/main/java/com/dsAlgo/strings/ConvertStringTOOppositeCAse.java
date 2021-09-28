package com.dsAlgo.strings;

public class ConvertStringTOOppositeCAse {
    public static void main(String[] args) {
        String str = "abcDEFGbhjkK1245";
        String res = "";

        //Method 1
        for(int i = 0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                res = res + Character.toUpperCase(ch);
            }else if (Character.isUpperCase(ch)){
                res = res + Character.toLowerCase(ch);
            }else{
                res = res +ch;
            }
        }
        System.out.println(res);

    //**************************************************************************

        //Method 2

        int diff = 'A' - 'a';
        Character res1;String finalres="";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                int var = ch - diff;
                 res1 = (char)var;
                finalres = finalres + res1;

            }
            else if (ch >= 'a' && ch<='z'){
                int var = ch +diff;
                 res1 = (char)var;
                 finalres = finalres + res1;
            }else
            finalres = finalres + ch;

        }
        System.out.println(finalres);


    }

}
