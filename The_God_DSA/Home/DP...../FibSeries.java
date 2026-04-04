public class FibSeries {


    // static int[] dp;
    public static int fibo(int n, int[] dp) {
        if(n <= 1) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fibo(n-1, dp) + fibo(n-2, dp); // recursion + memoization
    }

    public static int fib(int n) {
        int[] dp = new int[n+1];
        return fibo(n, dp);
    }
    


    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }
}
