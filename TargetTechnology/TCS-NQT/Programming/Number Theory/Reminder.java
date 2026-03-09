public class Reminder {


    public static int reminder(int n, int x) {
        return (n - x*(n / x));
    }

    public static void main(String[] args) {
        int n = 14, x = 4;

        int result = reminder(n, x);
        System.out.println(result);
    }
}