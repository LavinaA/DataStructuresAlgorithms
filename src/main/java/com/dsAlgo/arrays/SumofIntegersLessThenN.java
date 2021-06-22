package com.dsAlgo.arrays;

import java.util.Arrays;

/*
Array of Integers (N)
a+ b <= N
How many pairs?
        {5,1,2,4,3,7} / 8
        Sorted array {1,2,3,4,5,7}
 */
public class SumofIntegersLessThenN {
    public static void main(String[] args) {
        int[] input = {5, 1, 2, 4, 3, 7};
        int target = 8;
        int count = noOfPairs(input, target);
        System.out.println(count);
    }

    public static int noOfPairs(int [] arr,int target){
        Arrays.sort(arr); //{1,2,3,4,5,7}
        int start =0;
        int end = arr.length -1;
        int count =0;
        while (start < end) {
            int temp = arr[start] + arr[end];
            if (target >= temp) {
                count = count + (end-start);
                start++;

            }
            else if (target < temp){
                end--;
            }
        }
return count;

    }
}
