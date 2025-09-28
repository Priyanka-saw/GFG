public class largestNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 9 };
        System.out.println("Second largest number is :" + largestNo(arr));
    }

    static int largestNo(int[] arr) {
        int largest = arr[0];
        int Slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > Slargest && arr[i] !=largest){
                Slargest = arr[i];
            }
        }
        return Slargest;
    }
}
