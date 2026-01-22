import java.util.Scanner;

public class StringInput {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.next();
        System.out.println("Welcome " + name +   " to KG Coding");
    }
}
