package Arrays;

import java.util.*;

class Smallest {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Element is =" + smallest);
    }

}
