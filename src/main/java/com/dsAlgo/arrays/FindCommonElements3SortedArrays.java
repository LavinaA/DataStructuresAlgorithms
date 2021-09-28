package com.dsAlgo.arrays;
//Intersection of 3 sorted arrays

public class FindCommonElements3SortedArrays {
    public static void main(String[] args) {
        int arr1[] = {2,5,7,8,9,16};
        int arr2[] = {3,7,8,9,};
        int arr3[] = {1,3,4,7,9,11,13};
        findCommonElement(arr1,arr2,arr3);
    }

    private static void findCommonElement(int[] arr1, int[] arr2, int[] arr3) {

       int i = 0;
       int j = 0;
       int k = 0;

        while (i <= arr1.length - 1 && j <= arr2.length - 1 && k <= arr3.length - 1) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k] && arr3[k] == arr1[i]) {
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else
                k++;
        }
    }
}
