package com.dsAlgo.arrays;

import java.util.ArrayList;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {2,5,7,8,9,16};
        int arr2[] = {1,3,4,7,9,11,13};

        findUnion(arr1,arr2);

    }

    private static void findUnion(int[] arr1, int[] arr2) {

        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<arr1.length && j<arr2.length ){
            if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }else if ( arr1[i]<arr2[j]){
                list.add(arr1[i]);
                i++;
            }else{
                list.add(arr2[j]);
                j++;
            }
        }
        System.out.println(i+" "+j);
        //Priting remaining elements of the array
       /* while (i < arr1.length) {
            list.add(arr1[i]);
             }
            while (j < arr2.length) {
                list.add(arr2[j]);
        }*/

        for(Integer l:list){
            System.out.print(l+" ");
        }



    }
}
