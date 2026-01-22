package com.start;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("P1 -> Insert\nP2 -> Read\nP3 -> Update\nP4 -> Delete\n P5 ->Exit");
			System.out.print("Enter Choice");
			
			int choice = scanner.nextInt();
			
			if(choice == 5) {
				System.out.println("Thanks for using");
				break;
			}
			
			switch (choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
		}

	}

}
