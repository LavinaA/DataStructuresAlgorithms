package com.dsAlgo.arrays;

/* i/p -> 5,1,2,4,3,7
   o/p ->3,4,5 (3*3 + 4*4 = 5*5)
*/

import java.util.Arrays;

public class SumOfSquareofTwoNumberArray {
    public static void main(String[] args) {
         int [] input = {5,1,2,4,3,7};
         int [] input1 = new int [input.length];
         for(int i =0 ;i <= input.length-1 ;i++){
            input1[i] = input[i]*input[i];
;         }
         int [] res = sumOfSquaresofTwoNumbers(input1);
        for (int i = 0; i <= res.length - 1; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] sumOfSquaresofTwoNumbers(int[] input1) {
        Arrays.sort(input1);  // {1,4,9,16,25,49}
        for (int i = input1.length - 1; i >= 2; i--) {
            int start = 0;
            int end = i - 1;
            int target = input1[i];

            while (start < end) {
                int c = input1[start] + input1[end];
                if (target > c) {
                    start++;
                } else if (target < c) {
                    end--;
                } else if (target == c) {
                    int res[] = {input1[start], input1[end], target};
                    return res;
                }
            }
        }
        return null;
    }
}
