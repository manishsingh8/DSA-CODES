
import java.util.*;

class PermutationOfString {

    // function to calculate the length of string
    public static void permutation(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            // store the ith charecter
            char ch = str.charAt(i);
            // remaning string after excluding ith charector
            String newStr = str.substring(0, i) + str.substring(i + 1);
            // recursive call
            permutation(newStr, ans + ch);
        }

    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        permutation(str, "");
    }
}