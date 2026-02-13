package com.example.demo.reposittory;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;


@Repository
public class Crud {
	
	
	@Autowired
	private EntityManager entityManager;
	
	
	@Transactional
	public void save(Employee employee) {
		entityManager.persist(employee);
	}

}
