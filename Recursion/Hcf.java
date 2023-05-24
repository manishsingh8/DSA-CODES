import java.util.*;

public class Hcf {

    public static int Hcf(int number1, int number2, int count, int hcf) {
        if (count == number1 || count == number2) {
            return hcf;
        }
        if (number1 % count == 0 && number2 % count == 0) {
            hcf = count;
        }
        return Hcf(number1, number2, count + 1, hcf);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int count = 2;
        int hcf = count;
        System.out.println("hcf of the given number is=" + Hcf(number1, number2, count, hcf));
    }
}
