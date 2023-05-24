package Arrays;

import java.util.*;

public class SumofElement {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);

    }

}
