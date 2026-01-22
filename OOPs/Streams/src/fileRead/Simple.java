package fileRead;

import java.io.*;

public class Simple {

	public static void main(String[] args) throws Exception {
		
		
		FileReader fr = new FileReader("/Users/anujgahra/Developer/PG-DAC/Java_module/text.txt");
		
		int i;
		
		while((i=fr.read()) != -1) 
			System.out.print((char)i);
		
		fr.close();
	}

}
