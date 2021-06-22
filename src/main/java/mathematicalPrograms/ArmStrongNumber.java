package mathematicalPrograms;
/*
Sum of cubes of a number is equal to number itself
 */

public class ArmStrongNumber {
    public static void main(String[] args) {
        int number = 153;
        boolean b = findArmStrongNumber(number);
        if (b == true) {
            System.out.println("The number is Armstrong number");
        } else {
            System.out.println("The number is not an armstrong number");
        }
    }

    private static boolean findArmStrongNumber(int n) {
        int res = 0;
        int temp = n;
        while (temp > 0 ){
            int number = temp % 10;
            res = res + number*number*number;
            temp = temp / 10;
        }
        System.out.println(res);
        if (res == n) {
            System.out.println("Armstrong number");
            return true;
        } else {
            return false;
        }
    }
}
