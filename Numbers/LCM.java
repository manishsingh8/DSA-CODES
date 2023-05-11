package Numbers;

import java.util.*;

public class LCM {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int max = (n1 > n2) ? n1 : n2;
        int res = 0;
        for (int i = max; i < n1 * n2; i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                res = i;
            }

        }
        System.out.println(res);
    }
}
