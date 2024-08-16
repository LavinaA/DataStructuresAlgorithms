package com.dsAlgo.strings;
//How to check if two strings are rotations of each other

import javax.sound.midi.Soundbank;

public class CheckIfTwoStringsAreRotations {
    public static void main(String[] args) {

        String s1 = "Lavina";
        String s2 = "inaLav";

     boolean b =areRotation(s1,s2);
     if(b==true){
         System.out.println("The two strings are rotations of each other");
     }
     else if ( b== false){
         System.out.println("The two strings are not rotation");
     }

    }

    private static boolean areRotation(String s1, String s2) {

        if(s1.length() == s2.length()){
            String temp = s1+s1;
            if(temp.indexOf(s2)!=-1){
                return true;
            }
        }
        return false;
    }

}
