
package Arrays;

import java.util.*;

public class ReverseArray {

    public static int reverseArray(int arr[], int start, int end) {
        if (start >= end) {
            return end;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return reverseArray(arr, start + 1, end - 1);

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = size - 1;
        reverseArray(arr, start, end);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
