package bufferedWriter;

import java.io.*;

public class IOTest {
	try {
		FileWriter out = new FileWriter("test.txt");
		BufferedWriter b = new BufferedWriter(out);
		PrintWriter p = new PrintWriter(b);
		
		p.println("I' m Anuj Gahra from UP 21");
		
	} catch(Exception e) {
		System.out.println(e);
	}
}

