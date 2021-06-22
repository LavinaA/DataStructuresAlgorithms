package com.dsAlgo.arrays;

public class ReverseColumnsMatrix {
    public static void main(String[] args) {

        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10,11, 12},
        };


        int[][] arr = reverseColumns(a);
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[0].length - 1; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int[][] reverseColumns(int a[][]) {

        int rowstart =0;
        int colstart=0;
        int rowend= a.length-1;
        int colend=a[0].length-1;


        for(int i=0;i<=colend;i++){
            rowstart =0;
            rowend=a.length-1;
            while(rowstart<rowend){
                int temp = a[rowstart][i];
                a[rowstart][i]=a[rowend][i];
                a[rowend][i]=temp;
                rowstart++;
                rowend--;
            }
        }
        return a;
    }
}
