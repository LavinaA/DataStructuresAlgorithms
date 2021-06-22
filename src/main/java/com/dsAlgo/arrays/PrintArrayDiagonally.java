package com.dsAlgo.arrays;/*Print elements of an array diagonally

1  2  3  4
5  6  7  8
9  10 11 12

o/p -> 1 2 5 3 6 9 4 7 10 8 11 12
 */

public class PrintArrayDiagonally {

    public static void main(String[] args) {

        //int a[][] = new int [4][4];
        int a[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("The input array is as below");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[0].length - 1; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int k = 0; k <= a[0].length - 1; k++) {

            printArray(0, k, a);
        }

        for (int k = 1; k <= a.length - 1; k++) {

            printArray(k, 3, a);
        }

    }

    public static void printArray(int i ,int j ,int arr[][]){

        while (withinBoundary(i, j, arr)) {
            System.out.println(arr[i][j]);
            i++;
            j--;
        }
        System.out.println();
    }

    public static boolean withinBoundary(int i, int j, int [][] arr) {

        int maxrow = arr.length-1;
        int maxcol =arr[0].length-1;

        int minrow=0;
        int mincol=0;

        if((i < minrow || i > maxrow) || (j < mincol || j > maxcol)){
            return false;
        }
        return true;
    }
}





