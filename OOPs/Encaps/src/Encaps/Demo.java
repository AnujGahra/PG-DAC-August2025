package Encaps;

import java.util.Scanner;

public class Demo {
	private int bal = 1010;
	
//	Accessor
	
	public int access() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Your PIN: ");
		int pin = s.nextInt();
		if(pin == 1999)
			return bal;
		else
			return 0;
	}
	
//	Mutator
	public void mutator(int bal) {
		this.bal = bal;
	}
}
