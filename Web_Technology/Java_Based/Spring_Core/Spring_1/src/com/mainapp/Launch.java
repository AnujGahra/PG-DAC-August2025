package com.mainapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Launch {

	public static void main(String[] args) {
		
		ClassPathResource resourse = new ClassPathResource("bean.xml");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resourse);
		Employee emp = (Employee) xmlBeanFactory.getBean("emp");
		emp.test();
	}

}
