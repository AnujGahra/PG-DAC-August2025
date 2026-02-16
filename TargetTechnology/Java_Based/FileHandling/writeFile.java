import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeFile {
    

    public static void main(String[] args) {
        

        String s = "Hello, this is a sample text to write into the file.";


        byte[] b =  s.getBytes();

        try {
            FileOutputStream fos = new FileOutputStream("myData.txt");
            fos.write(b);
            System.out.println("Data written to the file successfully.");
            fos.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        

    }
}
