package com.dsAlgo.sortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {10, 8, 12, 4, 15};
        for (int i = 0; i <= arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
