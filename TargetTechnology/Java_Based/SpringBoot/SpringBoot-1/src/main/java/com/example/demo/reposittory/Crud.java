package com.example.demo.reposittory;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class Crud {
	
	
	@Autowired
	private EntityManager entityManager;
	
	public void save() {
		entityManager.persist(null);
	}

}
