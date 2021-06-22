package com.dsAlgo.arrays;

public class ThirdMaxInArray {
    public static void main(String[] args) {

        int arr[] = {1, 8, 2, 3, 9, 11, 15, 5};
        int tmax = findThirdMaxinArray(arr);
        System.out.println(tmax);
    }
    private static int findThirdMaxinArray(int[] arr) {

        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fmax) {
                tmax = smax;
                smax = fmax;
                fmax = arr[i];
            } else if (arr[i] > smax && arr[i] < fmax) {
                tmax = smax;
                smax = arr[i];
            } else if (arr[i] > tmax && arr[i] < smax) {
                tmax = arr[i];
            }
        }
        return tmax;
    }
}
