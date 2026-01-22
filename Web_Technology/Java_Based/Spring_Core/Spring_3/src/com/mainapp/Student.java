package com.mainapp;

public class Student {

	static {
		System.out.println("Student Bean LOADING...");
	}
	
	public Student() {
		System.out.println("Student Bean Instaintiated....");
	}
	
	public void test() {
		System.out.println("Student TESTED.......");
	}

	
}
