package com.example.demo;

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
		bean.readMyData().forEach(n->System.out.println(n));
		
		
	}

}
