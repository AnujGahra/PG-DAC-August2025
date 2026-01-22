package com.mainapp;

public class Employee {
	
	static {
		System.out.println("EMP Bean LOADING...");
	}
	
	public Employee() {
		System.out.println("EMP Bean Instaintiated....");
	}
	
	public void test() {
		System.out.println("EMP TESTED.......");
	}

}
