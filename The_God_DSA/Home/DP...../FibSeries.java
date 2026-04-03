public class FibSeries {


    static int[] dp;
    public static int fibo(int n) {
        if(n <= 1) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fibo(n-1) + fibo(n-2);
    }

    public static int fib(int n) {
        dp = new int[n+1];
        return fibo(n);
    }
    


    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }
}
