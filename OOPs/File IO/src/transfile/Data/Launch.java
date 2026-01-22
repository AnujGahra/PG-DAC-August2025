package transfile.Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Launch {

	public static void main(String[] args) throws Exception {
		
		String path = "/Users/anujgahra/Developer/PG-DAC/Java_module/Resources/f1/abc.txt";
		
		
		FileInputStream fis = new FileInputStream(path);
		String data = "";
		String vowels="";
		
		int temp = 0;
		while(true) {
			temp = fis.read();
			if(temp == -1) break;
			data = data+(char)temp;
		}
		System.out.println(data);
		
		String[] split = data.split(" ");
		for(int i=0; i<split.length; i++) {
			if(split[i].startsWith("a") || split[i].startsWith("e") || split[i].startsWith("i") || split[i].startsWith("o") || split[i].startsWith("u")) {
				vowels = vowels+split[i] + " ";
			}
		}
		System.out.println(vowels);
		
		FileOutputStream fos = new FileOutputStream("/Users/anujgahra/Developer/PG-DAC/Java_module/Resources/f2/pqrs.txt");
		fos.write(vowels.getBytes());
		
		System.out.println("Data sent successfully");
		
		fis.close();
		fos.close();
		

	}

}
