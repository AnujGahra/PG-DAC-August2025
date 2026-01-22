public class CheckArrayIsPalindrome {
    

    // check if an array is palindrome
    public static boolean isArrayPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] agrs) {
        int[] args = {1, 2, 3, 2, 1};

        if (isArrayPalindrome(args)) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is not Palindrome");
        }
    }
}
