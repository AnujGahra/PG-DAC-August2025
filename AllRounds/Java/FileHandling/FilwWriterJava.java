import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FilwWriterJava {

    public static void main(String[] args) {
        
        String fileName = "example.txt";
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
             
            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();
            bufferedWriter.write("This is a test file.");
            bufferedWriter.newLine();
            bufferedWriter.write("Goodbye!");
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }

    }
}