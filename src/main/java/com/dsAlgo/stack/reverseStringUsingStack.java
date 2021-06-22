package com.dsAlgo.stack;

import java.util.Stack;

public class reverseStringUsingStack {
    public static void main(String[] args) {

        String str = "Lavina";

        /*input.push('L');
        input.push('A');
        input.push('V');
        input.push(('I'));
        input.push('N');
        input.push('A');*/
        String res = reverseStringUsingStack(str);
        System.out.println("The reverse of a string " + str + " is " + res);
    }

    public static String reverseStringUsingStack(String str){
        Stack<Character> input = new Stack<Character>();

        char ch[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
                input.push(ch[i]);
        }
        String res = " ";
        while(!input.isEmpty()){
        res = res + input.pop();
        }

      return res;
    }
}
