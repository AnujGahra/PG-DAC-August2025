public class reverseAnArray {


    // Method to reverse an array Using brute force approach
    public static void reverseAnArray(int[] arr, int n) {

    }


    // Using two pointers approach
    public static void reverseAnArrayTwoPointers(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }
    


    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        reverseAnArray(arr, n);
        System.out.println("Reversed array using brute force approach:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
