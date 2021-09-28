package com.dsAlgo.arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };

        int tmp;
        for(int i=0;i<arr.length;i++){
            for(int j =i;j<arr[0].length;j++){
                tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }


       for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }






   }
}
