package com.interfaceApp;

public interface Animal {
	
	public static final int MAX_AGE = 23;
	
	
	public abstract void eat();
	
	void sleep();
	
	
	public static void info() {
		System.out.println("This is an Animal interface.");
	}
	
	
	public default void run() {
		this.eat();
		System.out.println("Animal is running.");
	}
	
	
}
