import java.util.*;
// finding the last non zero digit of factorial of a number

public class LastNonZeroDigit {

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int digit(int sum) {
        if (sum == 1) {
            return 1;
        }
        return ((sum % 10) != 0) ? sum % 10 : digit(sum / 10);

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastNZD = fact(n);
        digit(lastNZD);
        System.out.println("factorial of a number is=" + fact(n));
        System.out.println("Last Non Zero Digit =" + digit(lastNZD));
    }
}
