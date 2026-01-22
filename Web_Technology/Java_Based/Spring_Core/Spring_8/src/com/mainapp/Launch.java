package com.mainapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Launch {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = (Employee) ac.getBean("emp");
		Manager mng = (Manager) ac.getBean("mng");
		Student std = (Student) ac.getBean("std");
		
		System.out.println(emp);
		System.out.println(mng);
		System.out.println(std);
		 
	}

}
