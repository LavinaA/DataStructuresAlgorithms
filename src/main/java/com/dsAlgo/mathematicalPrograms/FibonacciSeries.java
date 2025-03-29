package mathematicalPrograms;

import java.util.Scanner;


public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number till where Fibonacci series is expected");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] fibo = fibonacciSeriesUsingArray(n);
        int[] fibo1 = fibonacciSeriesUsingThreeVar(n);

        //Note :Ignore fibonacci series using recursion as
        // the logic for program using recursion is not correct
        /*int[] fibo3 =fibonacciSeriesUsingRecursion(n);
        System.out.println("Series using recursion");*/

        System.out.println("Series using Array");
        for (int i = 0; i < n; i++) {
            System.out.println(fibo[i]);
        }
        System.out.println("Series using three variables");
        for (int i = 0; i < n; i++) {
            System.out.println(fibo1[i]);
        }
    }

    /*static int[] fibonacciSeriesUsingRecursion(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciSeriesUsingRecursion(n - 1) + fibonacciSeriesUsingRecursion(n - 2);
        }
    }*/


    private static int[] fibonacciSeriesUsingThreeVar(int n) {
        int f1 = 1;
        int f2 = 1;
        int i = 2;
        int arr[] =new int[n];
        while (i < n ) {
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            arr[i] = f3;
            i++ ;
        }
        arr[0] = 1;
        arr[1] = 1;
        return arr;
    }

    private static int[] fibonacciSeriesUsingArray(int n) {
        int f1 = 1;
        int f2 = 1;
        int arr[] =new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr;
    }

}

