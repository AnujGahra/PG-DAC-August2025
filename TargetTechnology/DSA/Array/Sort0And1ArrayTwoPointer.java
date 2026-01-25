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



    static void statsortZeroesAndOnesUsingTwoPointer(int[] arr) {
        int n = arr.length;
        int left = 0, right = n-1;

        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }


    static void sortArrayByParity(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 == 1) {
                right--;
            } else {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }


    static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n-1;

        int[] ans = new int[n];
        int k = 0;

        while(left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
            return ans;
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
