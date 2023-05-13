
import java.util.*;

class LargestEleInArray {

    public static int LargestElement(int arr[], int i, int val) {

        if (i == arr.length - 1) {
            val = (val > arr[i]) ? val : arr[i];
            // return val;
        } else if (arr[i] > arr[i + 1]) {
            val = arr[i];
        } else {
            val = arr[i + 1];
        }
        LargestElement(arr, i + 1, val);
        return val;

    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        int val = 0, i = 0;
        LargestElement(arr, i, val);
        System.out.println(LargestElement(arr, i, val));

    }
}
