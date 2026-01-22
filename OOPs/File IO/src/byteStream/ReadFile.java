package byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("/Users/anujgahra/Developer/PG-DAC/Java_module/Resources/output.txt");
		
		while(true) {
			
			int i = 0;
			try {
				i = fis.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==-1) {
				break;
			}
			System.out.print((char)i);
		}
		
		fis.close();
		
//		Delete
		System.out.println(new File("/Users/anujgahra/Developer/PG-DAC/Java_module/Resources/output.txt").delete());

	}

}
