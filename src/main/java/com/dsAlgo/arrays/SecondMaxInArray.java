package com.dsAlgo.arrays;

public class SecondMaxInArray {
    public static void main(String[] args) {
        int arr[] = {1,0,3,5,0,6,0,10,11,0};
        int smax = findSecondMaxArray(arr);
        System.out.println("The second max number is "+smax);
    }

    private static int findSecondMaxArray(int[] arr) {
        int fmax;
        int smax;

        if (arr[0] > arr[1]) {
            fmax = arr[0];
            smax = arr[1];
        } else {
            fmax = arr[1];
            smax = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > fmax) {
                smax = fmax;
                fmax = arr[i];
            } else if (arr[i] > smax && arr[i] < fmax) {
                smax = arr[i];
            }
        }
        System.out.println("The first max from an array is "+fmax);
return smax;
    }
}

