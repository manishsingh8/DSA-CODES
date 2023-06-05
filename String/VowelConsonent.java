package String;

import java.util.*;

public class VowelConsonent {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // checking the charecter
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("It's Vowel");
        } else {
            System.out.println("It's Consonent");
        }
    }
}
