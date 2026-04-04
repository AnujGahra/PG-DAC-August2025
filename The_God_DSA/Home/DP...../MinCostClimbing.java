import java.util.Arrays;

public class MinCostClimbing {

    public static int minCost(int[] cost, int n, int[] dp) {
        if(n <= 1) return cost[n];
        if(dp[n] != -1) return dp[n];
        return dp[n] = cost[n] + Math.min(minCost(cost, n-1, dp), minCost(cost, n-2, dp)); // recursion + memoization
    }



    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // n is going fron n-1 to 0
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost, n-1, dp), minCost(cost, n-2, dp));
    }
    


    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }
}
