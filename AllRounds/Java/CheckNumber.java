import java.util.Scanner;

public class CheckNumber {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a number: ");
        int num3 = sc.nextInt();

        // if( num < 0) {
        //     System.out.println("It is a Negative Number");
        // } else if( num > 0) {
        //     System.out.println("It is a Positive Number.");
        // } else {
        //     System.out.println("Number is Zero.");
        // }

        // check number is odd or even
        // if(num % 2 == 0) {
        //     System.out.println("Even");

        // } else {
        //     System.out.println("Odd");
        // }

        if(num1 > num2 && num2 > num3) {
            System.out.println(num1 + " is greator number");
        } else if(num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greator number");
        }  else {
            System.out.println(num3 + " is greator number");
        }

    }
}
