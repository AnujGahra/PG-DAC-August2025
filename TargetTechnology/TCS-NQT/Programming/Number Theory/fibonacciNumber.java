public class fibonacciNumber {

    public static void main(String[] args) {
        // int a = 0;
        int b = 1;

        int a[] = new int[n];
        if (n == 1) {
            return new int[] { 0 };
        }

        a[1] = 1;
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a;

    }
}
