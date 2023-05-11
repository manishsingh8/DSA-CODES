package EasyProgram;

import java.util.*;

public class Greatest {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String res = (n1 > n2) ? "n1 is greater" : "n2 is greater";
        System.out.println(res);
        System.out.println(Math.max(n1, n2));
    }

}
