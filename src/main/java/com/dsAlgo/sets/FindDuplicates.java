package com.dsAlgo.sets;
/*
Program to find duplicate elements in array and print as a list
array - { 1,2,5,2,8,1,9}
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(2);
        arr.add(8);
        arr.add(1);
        arr.add(9);

        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> resultSet = new HashSet<Integer>();

        for(Integer i : arr){
            if(!set.add(i)){
                resultSet.add(i);
            }
        }

        for (Integer a: resultSet) {
            System.out.println(a);
        }
    }
}
