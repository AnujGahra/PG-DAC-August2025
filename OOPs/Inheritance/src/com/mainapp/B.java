package com.mainapp;

public class B extends A {

	public B(String a) {
		
	this(10);
		System.out.println("CCC1");
	}
	
	public B(double d) {
		this(10,10);
		System.out.println("CCC2");
	}
	
	public B(int a, int b) {
		super("raju");
		System.out.println("CCC3");
	}
	
	public B(int a) {
		this(10.77);
		System.out.println("CCC4");
	}
	
}
