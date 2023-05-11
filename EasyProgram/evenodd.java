package EasyProgram;

import java.util.*;

public class evenodd {
    // way of recursion recursion
    public static void EvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // if (n % 2 == 0) {
        // System.out.println("Even");
        // } else {
        // System.out.println("odd");
        // }
        EvenOdd(n);
    }
}
