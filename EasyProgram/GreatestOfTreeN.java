package EasyProgram;

import java.util.*;

public class GreatestOfTreeN {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        // taking user input for three number
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        // finding the greatest number
        int result = (n1 >= n2) ? n1 : n2;
        if (result > n3) {
            System.out.println("greatest number is=" + result);
        } else {
            System.out.println("greatest number is=" + n3);
        }

    }
}
