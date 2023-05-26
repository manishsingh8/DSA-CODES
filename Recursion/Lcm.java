
import java.util.*;

class Lcm {

    public static int hcf(int n1, int n2) {
        return n1 == 0 ? n2 : hcf(n2 % n1, n1);
    }

    public static int lcm(int n1, int n2, int highestcf) {
        return ((n1 % n2) / highestcf) * n2;
        // or
        // return ((n2%n1)/highestcf) *n1;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int highestcf = hcf(n1, n2);
        System.out.println("hcf of the given number is => " + hcf(n1, n2));
        System.out.println("Lcm of the given numbers is => " + lcm(n1, n2, highestcf));

    }
}
