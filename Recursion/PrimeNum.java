// package EasyProgram.Recursion;

import java.util.*;

class PowerOfNum {

    public static int PrimeNo(int n1, int n2) {

        if (n2 == n1) {
            return 1;
        }
        if (n1 % n2 == 0) {
            return 0;
        }
        return (n1 % n2 == 0) ? 0 : PrimeNo(n1, n2 + 1);

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = 2;
        System.out.println(PrimeNo(n1, n2));
    }
}
