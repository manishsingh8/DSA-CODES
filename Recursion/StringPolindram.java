import java.util.*;

public class StringPolindram {

    public static String polindram(String str, int s, int e) {

        if (s == e) {
            return "polindram";
        }
        return (str.charAt(s) == str.charAt(e)) ? (polindram(str, s + 1, e - 1)) : "not polindram";
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s = 0;
        int e = str.length() - 1;
        System.out.println(polindram(str, s, e));
    }

}
