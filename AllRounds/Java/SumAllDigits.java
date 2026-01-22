public class SumAllDigits {
    

    public static int SumAllDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10;       // Remove the last digit
        }
        return sum;
    }
    public static void main(String[] args) {
        int number = 12345;

        int sum = SumAllDigits(number);
        System.out.println("Sum of all digits in " + number + " is: " + sum);
    }
}
