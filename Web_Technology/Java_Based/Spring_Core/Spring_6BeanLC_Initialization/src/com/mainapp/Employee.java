package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	public Employee() {
		System.out.println("EMP Bean Instantiation");
	}
	
	
//	initialization
	
//	public void xmlInit() {
//		System.out.println("Resourse Allocation");
//	}
	
//	@PostConstruct
//	public void annoInit() {
//		System.out.println("Resourse Allocation");
//	}
	
	
	public void test() {
		System.out.println("EMP Bean  TESTED....");
	}
	
	
//	Destroy
//	public void xmlDestroy() {
//		System.out.println("Resourse De-Allocation");
//	}
	
	
//	@PreDestroy
//	public void annoDestroy() {
//		System.out.println("Resourse De-Allocation");
//	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Resourse Allocation");

		
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Resourse De-Allocation");

		
	}

    
}
