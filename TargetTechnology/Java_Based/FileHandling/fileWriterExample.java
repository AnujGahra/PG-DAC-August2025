import java.io.FileWriter;
import java.io.IOException;

public class fileWriterExample {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("myData.txt")) {

            fw.write("Hello World\n");
            fw.write("This is written using FileWriter\n");
            fw.write("FileWriter works with characters");

            System.out.println("Data written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
