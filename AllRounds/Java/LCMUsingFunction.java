import java.util.Scanner;

public class LCMUsingFunction {


    // Function to calculate GCD
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Function to calculate LCM
    static int findLCM(int a, int b) {
        int max = Math.max(a, b);

        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // int lcm = findLCM(a, b);

        // System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        // int gcda = gcd(a, b);
        // System.out.println("GCD of " + a + " and " + b + " is: " + gcda);

        // GCD
        int min = Math.min(a, b);
        for(int i = min; i >= 1; i--) {
            if(a % i == 0 && b % i == 0) {
                System.out.println("GCD is: " + i);
                break;
            }
        }


    }
}
