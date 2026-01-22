import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {
            FileReader fr = new FileReader(fileName);
            int ch;

            System.out.println("\nFile contents:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found! Please check the file name.");
        }
        catch (IOException e) {
            System.out.println("Error while reading the file.");
        }

        sc.close();
    }
}
