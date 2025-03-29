package com.dsAlgo.SearchTechniques;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int key = 15;
        int start =0;
        int end=arr.length-1;
        binarySearch(arr,0,end,key);
    }

    private static void binarySearch(int[] arr, int start, int end, int key) {
        int mid = (start+end)/2;
        while(start < end){
            if(key > arr[mid] ){
                start = mid +1;
            } else if ( key < arr[mid]){
                end = mid -1;
            }
            else if (key == arr[mid]){
                System.out.println(" Element to be searched is found");
                break;
            }
            mid = (start + end)/2;
        }
        if(start >= end){
            System.out.println(" Element is not found");
        }
    }
}
