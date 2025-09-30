import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 11, 13, 14, 5, 6 };
        reverse(arr);
        System.out.println("Reverse of an array is : " + Arrays.toString(arr));

    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
