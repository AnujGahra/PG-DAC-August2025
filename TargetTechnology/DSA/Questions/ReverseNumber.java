import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println(0);

        }

        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
        System.out.println(); // New line after printing reversed number
    }
}
