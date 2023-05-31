import java.util.*;

public class Factorial {
    // recursive function to calculate factorial
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("factorial of a number is=" + fact(n));
    }
}
