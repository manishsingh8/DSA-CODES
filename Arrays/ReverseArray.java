
package Arrays;

import java.util.*;

public class ReverseArray {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[size];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[j++] = arr[i];
        }
        System.out.println("Reversed Array =>");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
