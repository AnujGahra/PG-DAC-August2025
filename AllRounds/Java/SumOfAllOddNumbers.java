import java.util.Scanner;

public class SumOfAllOddNumbers {
    
    public static int sumOddNum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = sumOddNum(n);
        System.out.println("Sum of all odd numbers from 1 to " + n + " is: " + sum);
    }
}
