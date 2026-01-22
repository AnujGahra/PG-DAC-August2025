package byteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Launch {

    public static void main(String[] args) {
        // Always use try-with-resources for automatic closing
        String s = "This is my car";
        byte[] b = s.getBytes();

        // ✅ Provide a full file name (including the file itself, e.g. output.txt)
        String filePath = "/Users/anujgahra/Developer/PG-DAC/Java_module/Resources/output.txt";

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(b);
            System.out.println("Data sent successfully to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
