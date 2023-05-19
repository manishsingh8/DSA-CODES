package EasyProgram;

import java.util.*;

public class PrimeNo {

    public static int primeNumber(int n1, int count) {
        if (n1 == count || count == n1 - 1) {
            return 1;
        }

        return (n1 % count == 0) ? 0 : primeNumber(n1, count + 1);

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // taking number from user
        int n1 = sc.nextInt();
        int count = 2;
        // checking if number is prime or not

        // first aproach using if else

        // if (n1 == count) {
        // System.out.println("Prime Number");
        // } else {
        // while (count < n1) {
        // if (n1 % count == 0) {
        // System.out.println("Not a prime number");
        // break;
        // } else if (count == n1 - 1) {
        // System.out.println("Prime Number");
        // }
        // count++;
        // }
        // }
        int result = primeNumber(n1, count);
        if (result == 0) {
            System.out.println("Not a Prime Number");
        } else {
            System.out.println("Prime Number");
        }

    }
}
