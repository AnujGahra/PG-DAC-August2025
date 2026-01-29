import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= nums[j];
                }
            }
            ans[i] = prod;
        }
        return ans;
    }

    // Optimized approach O(n) time and O(n) space
    public int[] productExceptSelfOpt(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // Calculate prefix products
        for(int i=1; i<n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        // Calculate suffix products
        for(int i=n-2; i>=0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }


        // Calculate result by multiplying prefix and suffix products
        for(int i=0; i<n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }


        return ans;
    }


    // Optimized approach O(n) time and O(1) space
    public int[] productExceptSelfOptS(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Calculate prefix products
        for(int i=1; i<n; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }

        int suffix = 1;
        for(int i=n-2; i>=0; i--) {
            suffix *= nums[i+1];
            ans[i] *= suffix;
        }
        return ans;
    }

    // main method to test the function
    public static void main(String[] args) {
        ProductofArrayExceptSelf solution = new ProductofArrayExceptSelf();

        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }
}
