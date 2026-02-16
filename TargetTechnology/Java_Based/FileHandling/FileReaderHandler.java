import java.io.FileReader;

public class FileReaderHandler {
    


    public static void main(String[] args) {
        
        try {
            
            FileReader fr = new FileReader("myData.txt");

            int temp = 0;
            while ((temp = fr.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
