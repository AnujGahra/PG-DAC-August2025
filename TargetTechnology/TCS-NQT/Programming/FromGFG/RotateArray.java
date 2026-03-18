public class RotateArray {
    

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;

        int n = arr.length;

        // Handle case where d > n
        d %= n;

        int[] temp = new int[n];

        for(int i = 0; i<n-d; i++) {
            temp[i] = arr[d+i];
        }


        for(int i = 0; i<d; i++) {
            temp[n-d+i] = arr[i];
        }

        for(int i = 0; i<n; i++) {
            arr[i] = temp[i];
        }

        for(int num: arr) {
            System.out.print(num + " ");
        }
    }
}
