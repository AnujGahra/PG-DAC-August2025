public class Sort0And1ArrayTwoPointer {


    static void sortZeroesAndOnes(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        // Count number of zeros
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                zeros++;
            }
        }



        // 0 to zeros-1 : 0s, Zeros to n-1 : 1s
        for(int i = 0; i < n; i++) {
            if(i < zeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
        sortZeroesAndOnes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
