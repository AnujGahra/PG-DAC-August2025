package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.example.demo.entity.Employee;
import com.example.demo.repo.MyCrudRepository;
import com.example.demo.repo.MyJpaRepository;

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
//		Optional<Employee> byId = bean.findById(12);
//		Employee employee = byId.get();
//		System.out.println(employee);
//		
//		
//		List<Employee> byName = bean.findByName("Anuj");
//		System.out.println(byName);
//		
//		
//		List<Employee> byNameStartWith = bean.findByNameStartingWith("Anuj");
//		System.out.println(byNameStartWith);
		
		
//		Employee employee = new Employee(15, "Mohan");
		
//		Data Insertion 
//		bean.save(employee);
//		System.out.println("DATA SAVED SUCCESSFULLY...");
		
		
//		Update Data
//		Optional<Employee> byId = bean.findById(15);
//		if(byId.isPresent()) {
//			Employee employee = byId.get();
//			employee.setName("QUERTY");
//			bean.save(employee);
//			System.out.println("UPDATED....");
//		}
		
		
//		Bulk Data Insertion
//		Employee emp1 = new Employee(90, "NANNNN0");
//		Employee emp2 = new Employee(91, "NANNNN1");
//		Employee emp3 = new Employee(92, "NANNNN2");
//		
//		List<Employee> list = Arrays.asList(emp1, emp2, emp3);
//		bean.saveAll(list);
//		System.out.println("BULK INSERTION...");
		
		
		
//		delete operation
//		bean.deleteById(90);
//		System.out.println("DELETE SUCCESSFULLY...");
		
		
		MyJpaRepository bean2 = ac.getBean(MyJpaRepository.class);
		List<Employee> all = bean2.findAll(Sort.by("id").descending());
		all.forEach(n->System.out.println(n));
		
		
		
	}

}
