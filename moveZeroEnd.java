import java.util.Arrays;

public class moveZeroEnd {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 5, 0, 7, 9, 4, 0, 1 };
        MoveEnd(arr);
        System.out.print("Array after moving zeros to the end: " + Arrays.toString(arr));
    }

    static void MoveEnd(int[] arr) {
        int j = 0;
        
        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        // Fill remaining positions with zeros
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }
}
