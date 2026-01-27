package com.mainapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.Employee;

public class Launch {
	
//	NATIVE SQL

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("config");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
//		inserted(em);  
		read(em);
//		update(em);
//		delete(em);
		
		em.close();
		entityManagerFactory.close();
	}

	private static void delete(EntityManager em) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		
		
		
		
		transaction.commit();
		
	}

	private static void update(EntityManager em) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		
		
		
		
		transaction.commit();
		
	}

	private static void read(EntityManager em) {
		
		// ------------------------------
		// Approach 1: Native Query without Entity Mapping
		// ------------------------------
		/*
		String sql = "SELECT * FROM xemployee";

		Query query = em.createNativeQuery(sql);
		List<Object[]> list = query.getResultList();

		for (Object[] row : list) {
		    for (Object column : row) {
		        System.out.print(column + " ");
		    }
		    System.out.println();
		}
		*/


		// ------------------------------
		// Approach 2: Native Query with Entity Mapping (Recommended)
		// ------------------------------
		String sql = "SELECT * FROM xemployee";

		Query query = em.createNativeQuery(sql, Employee.class);
		List<Employee> list = query.getResultList();

		for (Employee employee : list) {
		    System.out.println(employee);
		}

		em.close();

	}

	private static void inserted(EntityManager em) {
		
		
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		String sql =
		        "INSERT INTO xemployee (id, name, address, salary) " +
		        "VALUES (?, ?, ?, ?)";

		for (int i = 1; i <= 10; i++) {

		    Query nativeQuery = em.createNativeQuery(sql);

		    nativeQuery.setParameter(1, 12345 + i);
		    nativeQuery.setParameter(2, "xyzijkl");
		    nativeQuery.setParameter(3, "adddrrr");
		    nativeQuery.setParameter(4, 676754 + i);

		    nativeQuery.executeUpdate();
		}

		transaction.commit();
		em.close();

		System.out.println("BULK DATA INSERTED");

		
	}

}
