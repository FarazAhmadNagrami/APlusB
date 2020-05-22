import java.util.*;

class APlusB {
    static int sumOfTwoDigits(int first_digit, int second_digit) {
        return first_digit + second_digit;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a1 = s.nextInt();
        int b1 = s.nextInt();
        System.out.println(sumOfTwoDigits(a1, b1));
    }
}