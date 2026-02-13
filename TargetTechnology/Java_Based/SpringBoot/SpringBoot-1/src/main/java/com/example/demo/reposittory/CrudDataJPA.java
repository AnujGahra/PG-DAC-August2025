package com.example.demo.reposittory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;


@Repository
public interface CrudDataJPA extends CrudRepository<Employee, Integer> {
	
	
	

}
