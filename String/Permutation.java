package String;

import java.util.*;

// program to find the permutation of the given sting

public class Permutation {

    public static void permutation(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, ans + ch);
        }
    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        permutation(str, "");

    }

}
