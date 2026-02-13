package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;

public interface MyCrudRepository extends CrudRepository<Employee, Integer> {
	
	
//	@Override
//	Iterable<Employee> findAll();
	
	

}
