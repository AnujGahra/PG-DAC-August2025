package com.mainapp;

import java.util.Scanner;

public class Manager {
	
	
	static {
		System.out.println("Manager Bean LOADING...");
	}
	
	public Manager() {
		System.out.println("Manager Bean Instaintiated....");
	}
	
	public String permission() {
		System.out.println(" Manager TESTED.......");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Key: ");
		
		int key = scanner.nextInt();
		
		if(key==111) {
			return "Granted";
		} else {
			return "Not Granted";
		}
	}

}
