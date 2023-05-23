package EasyProgram;

import java.util.*;

public class PrimeInRange {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // taking number from user
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i < n2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
