import java.util.*;

public class NthTerm {

    // function to find the nth term
    public static int nthTerm(int n, int current, int calculated) {
        int i, curr = 1;
        if (current == n + 1) {
            return 0;
        }
        // calculate the sum
        for (i = calculated; i < calculated + current; i++)
            curr *= i;
        return curr + nthTerm(n, current + 1, i);

    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 1;
        int calculated = 1;
        // int sum = 1;
        // int mul = 1;
        // int result = 0;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(sum + " ");
        // mul = mul * sum;
        // sum++;
        // }
        // result = result + mul;
        // mul = 1;
        // System.out.println();
        // }
        // System.out.println("nth term =>" + result);
        System.out.println(nthTerm(n, current, calculated));

    }
}
