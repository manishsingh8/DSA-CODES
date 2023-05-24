import java.util.*;

public class RevereseNum {

    public static int reverseNumber(int n, int revNum, int res) {
        if (n == 0) {
            return revNum;
        }
        res = n % 10;
        n = n / 10;
        revNum = revNum * 10 + res;
        return reverseNumber(n, revNum, res);

    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int revNum = 0;
        int res = 0;
        System.out.println("reversed number is=" + reverseNumber(number, revNum, res));
    }
}
