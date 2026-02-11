package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.EmployeeCrud;

@SpringBootApplication
public class Sb2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(Sb2Application.class, args);
		EmployeeCrud bean = ac.getBean(EmployeeCrud.class);
//		bean.save(new EmployeeEntity(11, "raju", "add1", 1100));
		
		bean.save(new EmployeeEntity(12, "raju12", "add12", 1200));
		bean.save(new EmployeeEntity(13, "raju13", "add13", 1300));

//		for read
//		List<EmployeeEntity> list = bean.findAll();
//		for(EmployeeEntity emp : list) 
//			System.out.println(emp);  
		
		Optional<EmployeeEntity> byId = bean.findById(12);
		EmployeeEntity employeeEntity = byId.get();
		System.out.println(employeeEntity);
		
		System.out.println("Application Started");
	}

}
