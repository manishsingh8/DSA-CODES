package String;

import java.util.*;

public class VowelConsonent {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // way to fine the ascii value of charecter
        int ascii = ch;
        int asciiValue = (int) ch;// it's typecast we can also find the ascii value like this
        System.out.println(ascii);

        // checking the charecter
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("It's Vowel");
        } else {
            System.out.println("It's Consonent");
        }
    }
}
