public class Factorial {
    

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;

        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
