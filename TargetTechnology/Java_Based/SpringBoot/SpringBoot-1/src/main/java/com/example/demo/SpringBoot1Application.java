package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Employee;
import com.example.demo.reposittory.Crud;
import com.example.demo.reposittory.CrudDataJPA;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(SpringBoot1Application.class, args);
		
		System.out.println("HELLO");
		
		Employee employee = new Employee(11, "Mahi");
		
//		Crud bean = ac.getBean(Crud.class);
//		bean.save(employee); 
		
		
		CrudDataJPA bean = ac.getBean(CrudDataJPA.class);
		bean.save(employee);
	}

}
