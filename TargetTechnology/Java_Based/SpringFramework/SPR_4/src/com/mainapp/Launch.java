package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;

public class Launch {

	public static void main(String[] args) {
		
		
//		IOC Container
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = ac.getBean(Employee.class);
		emp.test(); 
		

		
		ac.close();
		
				

	}

}


