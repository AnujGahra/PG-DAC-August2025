package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;

public class Launch {

	public static void main(String[] args) {
		
		
//		IOC Container
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = (Employee) ac.getBean("emp");
		emp.test(); 
		
		Employee emp1 = (Employee) ac.getBean("emp");
		emp1.test(); 
		
		ac.close();
		
		
//		Resource resource = new ClassPathResource("beans.xml");
//
//        BeanFactory factory = new XmlBeanFactory(resource);
//
//        Employee s = (Employee) factory.getBean("emp");
//        s.test();
//		

	}

}


