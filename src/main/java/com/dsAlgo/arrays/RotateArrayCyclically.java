package com.dsAlgo.arrays;
//Program to cyclically rotate an array to the right sideby 1

public class RotateArrayCyclically {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int temp = arr[arr.length - 1];
        for(int i=arr.length-1;i>=1;i--) {
            arr[i] = arr[i - 1];
        }//System.out.println(arr[i] +" "+ i);
                arr[0] =temp;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
