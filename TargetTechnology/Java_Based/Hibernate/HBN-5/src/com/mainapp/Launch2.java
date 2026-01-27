package com.mainapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.Employee;

public class Launch2 {

//	JPQL(Java Persistence Query Language)

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("config");
		EntityManager em = entityManagerFactory.createEntityManager();

//		inserted(em);   // in JPQL insert operation not supported
//		read(em);
		update(em);
//		delete(em);

		em.close();
		entityManagerFactory.close();
	}

	private static void delete(EntityManager em) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("deleteSQL");
		query.setParameter(1, 117);
		query.executeUpdate();

		transaction.commit();
		System.out.println("BULK DATA DELETED");
		em.close();

	}

	private static void update(EntityManager em) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		String jpql =
		        "UPDATE Employee e " +
		        "SET e.esalary = :esalary " +
		        "WHERE e.eid >= :eid";

		Query query = em.createQuery(jpql);

		query.setParameter("esalary", 98765);
		query.setParameter("eid", 900);

		query.executeUpdate();

		transaction.commit();

		System.out.println("BULK DATA UPDATED");

		em.close();


	}

	private static void read(EntityManager em) {
		
		String jpql = "SELECT e FROM Employee e"; // Aliasing is mandatory in JPQL

		Query query = em.createQuery(jpql, Employee.class);
		List<Employee> list = query.getResultList();

		for (Employee employee : list) {
		    System.out.println(employee);
		}

		em.close();

		

	}

	private static void inserted(EntityManager em) {

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		for (int i = 1; i <= 10; i++) {

		    Employee employee =
		            new Employee(900 + i, "jpqlname", "jpqladdr", 1000);

		    em.persist(employee);

		    if (i % 5 == 0) {
		        em.flush();   // Synchronizes persistence context with database
		        // em.clear(); // Optional: clears first-level cache
		    }
		}

		transaction.commit();
		em.close();

		System.out.println("BULK DATA INSERTED");
	}

}
