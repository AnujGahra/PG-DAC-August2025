public class SumOfArray {


    public static int sum(int[] arr) {
        int n = arr.length;

        int sum = 0;

        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String... args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println("sum of array is:" + sum(arr));
    }
}