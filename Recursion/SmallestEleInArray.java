import java.util.*;

public class SmallestEleInArray {

    public static int smallElement(int arr[], int s, int count) {

        if (arr.length == 1) {
            return arr[0];
        }
        if (count == arr.length - 1) {
            if (s < arr[count]) {
                return s;
            } else {
                return arr[count];
            }
        }

        return smallElement(arr, s, count + 1);

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int s = arr[0];
        int count = 0;
        int result = smallElement(arr, s, count);
        System.out.println("smallest element in array is =" + result);

    }
}
