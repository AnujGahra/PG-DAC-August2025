public class Reminder {

    public static int reminder(int n, int x) {
        return (n - x * (n / x));
    }

    // second method
    public static int getReminder(int n, int x) {
        int num = n/x;

        for(int i = 1; i<=num; i++) {
            n = n - x;
        }

        return n;
    }

    public static void main(String[] args) {
        int n = 15, x = 4;

        int result = reminder(n, x);
        System.out.println(result);

        System.out.println(getReminder(n, x));
    }
}