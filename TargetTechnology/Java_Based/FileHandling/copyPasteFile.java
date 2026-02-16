import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyPasteFile {
    


    public static void main(String[] args) {
        
        try {
            FileInputStream fis = new FileInputStream("img.jpg");
            byte[] b = fis.readAllBytes();


            FileOutputStream fos = new FileOutputStream("file/img1.jpg");

            fos.write(b);

            fis.close();
            fos.close();
            
            File file = new File("img.jpg");
            file.delete();
            System.out.println("File moved Successfully");

            
        } catch (Exception e) {
        }
    }
}
