import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyPasteFile {
    


    public static void main(String[] args) {
        
        try {
            FileInputStream fis = new FileInputStream("img.jpg");
            byte[] b = fis.readAllBytes();


            FileOutputStream fos = new FileOutputStream("file/img1.jpg");

            fos.write(b);
            System.out.println("File Copied Successfully");

            
        } catch (Exception e) {
        }
    }
}
