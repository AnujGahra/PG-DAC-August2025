public class KRotateArray {
    

    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than n
        int[] rotatedArr = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedArr[(i + k) % n] = arr[i];
        }

        return rotatedArr;
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] rotatedArr = rotateArray(arr, k);
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}
