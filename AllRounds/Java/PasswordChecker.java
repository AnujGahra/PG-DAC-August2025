import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";
        String enteredPassword;

        do {
            System.out.print("Enter password: ");
            enteredPassword = sc.nextLine();

            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
            }

        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Password accepted. Access granted!");
    }
}
