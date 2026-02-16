import java.io.File;
import java.io.IOException;

public class createFile {

    public static void main(String[] args) {
        
        File file = new File("myFile.txt");

        boolean isCreated;
        try {
            isCreated = file.createNewFile();
            if (isCreated) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}