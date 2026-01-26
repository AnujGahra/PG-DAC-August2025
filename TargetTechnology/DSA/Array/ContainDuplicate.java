public class ContainDuplicate {


    


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