package fileWrite;

import java.io.*;

public class Simple {

	public static void main(String[] args) {
		
		
		try {
			
			FileWriter fw = new FileWriter("/Users/anujgahra/Developer/PG-DAC/Java_module/text.txt");
			fw.write("My name is Anuj Gahra from Moradabad");
			fw.flush();
			
			fw.close();
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("Success");
		}

	}

}
