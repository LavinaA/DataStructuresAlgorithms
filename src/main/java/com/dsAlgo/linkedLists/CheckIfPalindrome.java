package com.dsAlgo.linkedLists;

//check if integer is palindrome
//121121
/*
Algorithm- Traverse the link list and push all the elements of the linked lists to Stack
Pop all the elements of one by one from stack and compare with  elements from linked lists
If all elements are equal then then return else return false and break the loop.
 */

import java.util.Stack;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        Link l1 = new Link(1);
        Link l2 = new Link(2);
        Link l3 = new Link(1);
        Link l4 = new Link(1);
        Link l5 = new Link(2);
        Link l6 = new Link(1);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        if(checkIfPalindrome(l1)){
            System.out.println("The number entered is palindrome");
        }else{
            System.out.println("The number entered is not palindrome");
        }
    }

    public static boolean checkIfPalindrome(Link l){
        Stack<Integer> stack = new Stack<Integer>();
        Link current = l;
        boolean flag = true;

        while (current != null) {
            stack.push(current.id);
            current = current.next;
        }

        while (l != null) {
            int i = stack.pop();
            if (i == l.id) {
                flag = true;
            }
            else{
                flag = false;
                break;
            }
            l = l.next;
        }
        return flag;
    }

}
