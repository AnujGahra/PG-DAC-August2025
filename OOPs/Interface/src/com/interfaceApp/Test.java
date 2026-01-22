package com.interfaceApp;

public class Test {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.eat();
		
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		
		System.out.println(Dog.MAX_AGE);
		System.out.println(Cat.MAX_AGE);
		System.out.println(Animal.MAX_AGE);
		
		Animal.info();
		
		cat.run();
		dog.run();
		
	}
}


 