package com.dsAlgo.arrays;

public class MoveZerosEndofArray {
    public static void main(String[] args) {
        int arr[] = {1,0,3,5,0,6,0,10,11,0};
        int a[] =MoveZerosEndofArray(arr);
        for (int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
    }
    public static int[] MoveZerosEndofArray(int[] a){
        int start= 0;
        int end = a.length-1;

        while (start < end) {
            if (a[start] == 0 && a[end] != 0) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;

                start++;
                end--;
            } else if (a[start] != 0) {
                start++;
            } else if (a[end] == 0) {
                end--;
            }
        }
        return a;
    }

}
