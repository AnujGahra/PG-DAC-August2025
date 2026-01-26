public class ContainDuplicate {

    // Brute Force
    public static boolean containsDuplicateBruteForce(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2. Sorting
    public static boolean containsDuplicateSorting(int[] nums) {
        java.util.Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // Using Hasing
    public static boolean containsDuplicateUsingHasing(int[] nums) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        // ContainDuplicate solution = new ContainDuplicate();
        int[] nums = { 1, 2, 3, 1, 3 };
        System.out.println(containsDuplicateUsingHasing(nums)); // Output: true
    }
}