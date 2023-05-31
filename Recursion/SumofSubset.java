import java.util.*;

public class SumofSubset {

    public static void sumOfSubset(int arr[], int l, int r, int sum) {

        if (l > r) {
            System.out.print(sum + " ");
            return;
        }
        sumOfSubset(arr, l + 1, r, sum + arr[l]);
        sumOfSubset(arr, l + 1, r, sum);
    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int r = n - 1;
        int l = 0;
        int sum = 0;
        sumOfSubset(arr, l, r, sum);

    }

}
