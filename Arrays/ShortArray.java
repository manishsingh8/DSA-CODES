package Arrays;

import java.util.*;

public class ShortArray {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // short the array in ascending
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        // check given array is shorted curretlly or not?
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("after shorting half in ascending and second half in descending");

        // now add the first half in ascending and second half in descending
        int count = size / 2;
        int end = size - 1;
        int arr2[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                arr2[i] = arr[i];
            } else {
                arr2[i] = arr[end];
                end--;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
