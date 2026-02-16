import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CloseInFinally {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            fos = new FileOutputStream("myData.txt");
            bos = new BufferedOutputStream(fos);

            String data = "Hello from finally block example";
            bos.write(data.getBytes());

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (bos != null) {
                    bos.close();   // closes bos + fos
                } else if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Program completed");
    }
}
