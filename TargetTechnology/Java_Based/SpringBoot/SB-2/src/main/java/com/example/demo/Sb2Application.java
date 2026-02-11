package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.EmployeeCrud;

@SpringBootApplication
public class Sb2Application {

    private final EmployeeCrud employeeCrud;

    Sb2Application(EmployeeCrud employeeCrud) {
        this.employeeCrud = employeeCrud;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(Sb2Application.class, args);
		EmployeeCrud bean = ac.getBean(EmployeeCrud.class);
//		bean.save(new EmployeeEntity(11, "raju", "add1", 1100));
		
		bean.save(new EmployeeEntity(12, "raju12", "add12", 1200));
		bean.save(new EmployeeEntity(13, "raju13", "add13", 1300)); // it is also used for update 

//		for read
		List<EmployeeEntity> list = bean.findAll();
		for(EmployeeEntity emp : list) 
			System.out.println(emp);  
		
		List<EmployeeEntity> list2 = bean.findAll(Sort.by("esalary"));
		for(EmployeeEntity emp: list2)
			System.out.println(emp);
		
		
//		Read by Id 
//		Optional<EmployeeEntity> byId = bean.findById(12);
//		EmployeeEntity employeeEntity = byId.get();
//		System.out.println(employeeEntity);  
		
//		bean.deleteAll();
//		bean.deleteById(13;
		
		
		
		
//		Native SQL method
		int saveMyData = bean.saveMyData(14, "raju14", "add14", 1400);
		System.out.println(saveMyData);
		
		
		List<EmployeeEntity> myData = bean.readMyData();
		System.out.println(myData);
		
		
		
		List<EmployeeEntity> myAllData = bean.readMyAllData();
		System.out.println(myAllData);
		
		
		
		List<EmployeeEntity> bySalary = bean.findByEsalary(1200);
		System.err.println(bySalary);
		
		
		List<EmployeeEntity> byEsalaryLessThan = bean.findByEsalaryLessThan(1400);
		System.out.println(byEsalaryLessThan);
		
		System.out.println("Application Started");
	}

}
