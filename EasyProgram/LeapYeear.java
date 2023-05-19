package EasyProgram;

import java.util.*;

public class LeapYeear {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // taking user input

        int n1 = sc.nextInt();
        // check if it's a leap year or not

        String result = (n1 % 4 == 0) ? "Leap Year" : "Not A Leap Year";

        System.out.println(result);
    }
}
