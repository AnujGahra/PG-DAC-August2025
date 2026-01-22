public class FibonacciSeries {
    

    // public static int fibonacci(int n) {
    //     if (n <= 1) {
    //         return n;
    //     }
    //     return fibonacci(n - 1) + fibonacci(n - 2);
    // }


    public static void main(String[] args) {
        int n = 10; // Number of terms in Fibonacci series
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {

            // System.out.print(fibonacci(i) + " ");
            if (i == 0) {
                System.out.print(0 + " ");
            } else if (i == 1) {
                System.out.print(1 + " ");
            } else {
                int a = 0, b = 1, fib = 0;
                for (int j = 2; j <= i; j++) {
                    fib = a + b;
                    a = b;
                    b = fib;
                }
                System.out.print(fib + " ");
            }
            
        }
    }
}
