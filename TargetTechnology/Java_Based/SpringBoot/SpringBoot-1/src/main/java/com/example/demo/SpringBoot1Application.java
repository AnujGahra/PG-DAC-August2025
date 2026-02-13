package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Employee;
import com.example.demo.reposittory.Crud;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(SpringBoot1Application.class, args);
		
		System.out.println("HELLO");
		
		Employee employee = new Employee(10, "Anuj");
		
		Crud bean = ac.getBean(Crud.class);
		bean.save(employee);
	}

}
