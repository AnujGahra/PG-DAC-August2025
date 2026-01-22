package com.mainapp;

public class Employee {
	
	private int test;
	
	static {
		System.out.println("EMP Bean LOADING...");
	}
	
	public Employee() {
		System.out.println("EMP Bean Instaintiated....");
	}
	
	public void test() {
		System.out.println("EMP TESTED......." + test);
	}

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}
	
	

}
