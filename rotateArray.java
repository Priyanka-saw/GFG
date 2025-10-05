import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args){

        int[] arr = {1, 3, 4, 5, 6};
        int d = 3;

        rotate(arr, d);

        System.out.print(Arrays.toString(arr));
        
    }

    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  // In case d >= n

        // reverse first d elements
        reverse(arr, 0, n - 1);

        // reverse remaining n-d elements
        reverse(arr, 0, d - 1);

        // reverse the entire array
        reverse(arr, d, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
