import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class ReadFileBuffered {

    public static void main(String[] args) {

        try (
            FileInputStream fis = new FileInputStream("myData.txt");
            BufferedInputStream bis = new BufferedInputStream(fis)
        ) {

            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
