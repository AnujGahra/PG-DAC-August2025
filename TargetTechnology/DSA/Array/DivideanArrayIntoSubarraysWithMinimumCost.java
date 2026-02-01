import java.util.Arrays;

public class DivideanArrayIntoSubarraysWithMinimumCost {

    public int minimumCost(int[] nums) {
        int first = nums[0];
        Arrays.sort(nums, 1, nums.length);
        return first + nums[1] + nums[2];
    }

    // main method for testing
    public static void main(String[] args) {
        DivideanArrayIntoSubarraysWithMinimumCost solution = new DivideanArrayIntoSubarraysWithMinimumCost();
        int[] nums = { 4, 2, 1, 3 };
        int result = solution.minimumCost(nums);
        System.out.println("Minimum Cost: " + result); // Expected output: 7
    }

}
