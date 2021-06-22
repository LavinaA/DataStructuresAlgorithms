package com.dsAlgo.arrays;
/*
Array -{5,7,1,9,2,3}
Target sum =8
Find a pair of number in i/p array where sum is equal to target sum
*/


import java.util.Arrays;

public class FindTargetSumInArray {
    public static void main(String[] args) {
        int [] arr = {5,7,1,9,2,8};
        int targetsum = 8;
        int[] num = findTargetSumInArray(arr, targetsum);
        for(int i =0 ;i<num.length;i++){
            System.out.println(num[i]);
        }
    }

    public static int[] findTargetSumInArray(int[] arr, int targetsum) {
        int start = 0;
        int end = arr.length - 1;

        Arrays.sort(arr);  // {1,2,5,7,8,9}
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum > targetsum) {
                end--;
            } else if (sum < targetsum) {
                start++;
            } else if (sum == targetsum) {
                int targetarr[] = {arr[start], arr[end]};
                return targetarr;
            }
        }
        return null;
    }
}
