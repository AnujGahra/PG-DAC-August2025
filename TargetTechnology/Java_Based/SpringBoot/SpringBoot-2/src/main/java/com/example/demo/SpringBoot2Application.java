package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Employee;
import com.example.demo.repo.MyCrudRepository;

@SpringBootApplication
public class SpringBoot2Application {

    private final MyCrudRepository myCrudRepository;

    SpringBoot2Application(MyCrudRepository myCrudRepository) {
        this.myCrudRepository = myCrudRepository;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(SpringBoot2Application.class, args);
		
		MyCrudRepository bean = ac.getBean(MyCrudRepository.class);
		
		
//		bean.findAll().forEach(n-> System.out.println(n));		
		
		
//		Iterable<Employee> all = bean.findAll();
//		all.forEach(n->System.out.println(n));
		
		
//		Iterable<Employee> all = bean.findAll();
//		for(Employee e : all) {
//			System.out.println(e);
//		}  
		
		
//		Custom read Data
//		bean.readMyData().forEach(n->System.out.println(n));
		
		
		
//		bean.readMyDataHQL().forEach(n->System.out.println(n));
		
//		find Data by ID
		Optional<Employee> byId = bean.findById(12);
		Employee employee = byId.get();
		System.out.println(employee);
		
		
		List<Employee> byName = bean.findByName("Anuj");
		System.out.println(byName);
		
		
		List<Employee> byNameStartWith = bean.findByNameStartingWith("Anuj");
		System.out.println(byNameStartWith);
		
		
	}

}
