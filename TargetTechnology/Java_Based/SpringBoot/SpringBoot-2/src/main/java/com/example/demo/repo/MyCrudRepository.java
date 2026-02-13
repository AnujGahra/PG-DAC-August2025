package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;

public interface MyCrudRepository extends CrudRepository<Employee, Integer> {
	
	
//	@Override
//	Iterable<Employee> findAll();
	
	
//	Custom Methods
	
	@Query(value = "select * from employee where name like 'm%' " ,nativeQuery = true)
	public List<Employee> readMyData();
	
	

}
