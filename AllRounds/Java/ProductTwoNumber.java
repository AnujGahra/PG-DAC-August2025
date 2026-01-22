import java.util.Scanner;

public class ProductTwoNumber {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********** Product of Two Floating Number ***********");
        System.out.print("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter the second number:");
        float b = sc.nextFloat();

        float product = a * b;
        System.out.println("The product of " + a + " and " + b + " is: " + product);
    }
}
