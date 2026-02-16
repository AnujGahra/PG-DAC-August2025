import java.io.File;

public class deleteFile {
    

    public static void main(String[] args) {
        
        File file = new File("myFile.txt");
        boolean isDeleted = file.delete();
        if (isDeleted) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
