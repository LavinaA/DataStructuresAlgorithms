package com.dsAlgo.arrays;

/*
Input matrix
1 2 3 4
5 6 7 8
9 1 2 6

O/p Matrix
4 3 2 1
8 7 6 5
6 2 1 9
 */

public class ReverseRowsMatrix {
    public static void main(String[] args) {

        int a[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 2, 6},
            };

        int[][] arr = reverseRows(a);
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[0].length - 1; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int[][] reverseRows(int a[][]) {

        int colstart = 0;
        int colend = a[0].length - 1;
        int rowend = a.length - 1;

        for (int i = 0; i <= rowend; i++) {
            while (colstart < colend) {
                int temp = a[i][colstart];
                a[i][colstart] = a[i][colend];
                a[i][colend] = temp;
                colstart++;
                colend--;
            }
            colstart =0;
            colend=a[0].length-1;
        }
        return a;
    }
}
