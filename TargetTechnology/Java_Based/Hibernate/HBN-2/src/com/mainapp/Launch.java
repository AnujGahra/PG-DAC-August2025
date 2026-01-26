package com.mainapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Employee;

public class Launch {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("config");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
//		inserted(em);  
//		read(em);
//		update(em);
		delete(em);
		
		em.close();
		entityManagerFactory.close();
	}

	private static void delete(EntityManager em) {
		Employee employee = em.find(Employee.class, 11);
		if(employee != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			
			em.remove(employee);
			transaction.commit();
			System.out.println("DATA DELETE SUCCESSFULLY...");
			
		} else {
			System.out.println("DATA NOT FOUND....");
		}
		
	}

	private static void update(EntityManager em) {
		Employee employee = em.find(Employee.class, 11);
		if(employee != null) {
			
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			
			employee.setEsalary(10000);
			em.merge(employee);
			
			transaction.commit();
			System.out.println("DATA UPDATED SUCCESSFULLY...");
			
		} else {
			System.out.println("DATA NOT FOUND...");
		}
		
	}

	private static void read(EntityManager em) {
		Employee employee = em.find(Employee.class, 11);
		System.out.println(employee);
		
	}

	private static void inserted(EntityManager em) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Employee employee = new Employee(12, "Anuj Gahra", "Hyderabad", 95000);
		em.persist(employee);
		
		
		transaction.commit();
		System.out.println("DATA INSERTED SUCCESSFULLY...");
	}

}
