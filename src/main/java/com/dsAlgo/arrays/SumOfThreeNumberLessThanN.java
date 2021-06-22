package com.dsAlgo.arrays;

/*
Given array of integers a+b+c <=N
How many pairs?
i/p array - 5,1,2,3,4,7 / 8
sorted array = 1,2,3,4,5,7 / 8
 */

import java.util.Arrays;

public class SumOfThreeNumberLessThanN {
    public static void main(String[] args) {
        int[] input = {5, 1, 2, 4, 3, 7};
        int target = 8;
        int count = noOfPairs(input, target);
        System.out.println(count);

    }

    private static int noOfPairs(int[] input, int target) {
        Arrays.sort(input);  // {1, 2, 3, 4, 5, 7}
        int res = 0;
        for (int i = 0; i <= input.length - 2; i++) {
            int a = input[i];
            int start = i + 1;
            int end = input.length - 1;


            while (start < end) {
                int sum = a + input[start] + input[end];
                if (sum > target) {
                    end--;
                } else if (sum <= target) {
                    res = res + (end - start);
                    start++;
                }
            }

        }
        return res;
    }
}