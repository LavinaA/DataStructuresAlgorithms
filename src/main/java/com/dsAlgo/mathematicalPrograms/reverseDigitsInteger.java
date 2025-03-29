package mathematicalPrograms;

public class reverseDigitsInteger {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        while (n > 0) {
            int number = n % 10;
            rev = rev * 10 + number;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
