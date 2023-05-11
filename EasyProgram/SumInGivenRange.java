package EasyProgram;

import java.util.*;

public class SumInGivenRange {

    public static int Sum(int n1, int n2) {
        if (n1 == n2) {
            return n1;
        }
        return n1 + Sum(n1 + 1, n2);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        // int count = 0;
        // while (n1 <= n2) {
        // count = count + n1;
        // n1++;
        // }
        // System.out.println(count);
        int res = Sum(n1, n2);
        System.out.println(res);
    }
}
