package com.mainApp;

import java.io.File;
import java.io.IOException;

public class FileDeleted {
	
public static void main(String[] args) throws IOException {
		
		
		for(int i=1; i<=10; i++) {
			File file = new File("/Users/anujgahra/Developer/PG-DAC/Java_module/Resources/abc"+i+".txt");
			boolean newFile = file.delete();
			
			if(newFile)
				System.out.println("File deleted");
			else
				System.out.println("Failed to deleted");
		}

	}

}
