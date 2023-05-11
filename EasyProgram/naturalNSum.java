package EasyProgram;

import java.util.*;

public class naturalNSum {

    public static int Sum(int n) // 3 0
    {
        if (n == 1) {
            return 1;
        }
        return n + Sum(n - 1);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int count = 0;
        // int i = 1;
        // while (i <= n) {
        // count = count + i;
        // i++;
        // }
        // System.out.println(count);
        int res = Sum(n);
        System.out.println(res);
    }
}
