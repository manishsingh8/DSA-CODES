package EasyProgram;

import java.util.*;

class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.print("Positive");
        } else {
            System.out.print("Negative");
        }
    }
}