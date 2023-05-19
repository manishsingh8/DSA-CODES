
import java.util.*;

public class PowerOfNum {

    public static int findPow(int n1, int n2) {
        if (n2 == 0) {
            return 1;
        }
        return n1 * findPow(n1, n2 - 1);
    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(findPow(n1, n2));
    }
}
