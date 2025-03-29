package mathematicalPrograms;

/*
Print all prime numbers till number entered by user
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to print prime numbers till that entered number range greater than 2");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("The number is not a prime number");
        }
       /* if (n == 3) {
            System.out.println("The number is a prime number");
        }*/

        for (int i = 2; i <= n; i++) {
            boolean b = IsPrime(i);
            if (b == true) {
                System.out.println("Number " + i + " is Prime Number");
            } else if (b == false) {
                System.out.println("Number " + i + " is not a Prime Number");
            }
        }
    }
    private static boolean IsPrime(int n) {
        boolean result;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
       return true;
    }
}
