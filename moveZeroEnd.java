public class moveZeroEnd {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 0, 7, 9, 4, 0, 1 };
        MoveEnd(arr);
    }

    static void MoveEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                // swap
                int temp = arr[i];
                arr[j] = temp;
                j++;
            }
        }

    }
}
