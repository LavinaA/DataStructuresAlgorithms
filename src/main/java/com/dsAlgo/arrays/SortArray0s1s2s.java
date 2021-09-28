package com.dsAlgo.arrays;

public class SortArray0s1s2s {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,1,0,0,0,2,2,0,2};
        sortArray(arr);
    }

    private static void sortArray(int[] arr) {
        int count0s =0;
        int count1s =0;
        int count2s =0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                count0s++;
            }else if(arr[i]==1){
                count1s++;
            }else if (arr[i]==2){
                count2s++;
            }
        }
        int j =0;
        for(int i=0;i<count0s;i++){
            arr[i]=0;
            j++;
        }
        for(int i =j; i<(count1s+count0s);i++) {
            arr[i] = 1;
            j++;
        }
        for(int i =j; i<(count1s+count2s+count0s);i++) {
            arr[i] = 2;
            j++;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }




    }
}
