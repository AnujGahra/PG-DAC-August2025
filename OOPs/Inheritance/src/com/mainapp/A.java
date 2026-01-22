package com.mainapp;

public class A {
	
	public A(int a) {
		this(10, 70);
		System.out.println("PCC1");
	}
	
//	method
//	public void m1() {
//		System.out.println("M1");
//	}
	
	public A(int a, int b) {
		System.out.println("PCC2");
	}
	
	public A(String a) {
		this(10.77);
		System.out.println("PCC3");
	}
	
	public A(double a) {
		this(10);
		System.out.println("PCC4");
	}
	
	
	

}
