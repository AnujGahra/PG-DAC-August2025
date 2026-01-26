package com.mainapp;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Employee;

public class Launch {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		
		InputStream resourceAsStream = null;
		
		try {
			resourceAsStream = Launch.class.getClassLoader().getResourceAsStream("config.properties");
			if(resourceAsStream == null) {
				System.out.println("File not found...");
			}
			properties.load(resourceAsStream);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(resourceAsStream != null) {
				try {
					resourceAsStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		Map<String, String> map = new HashMap<String, String>();
		for( String key : properties.stringPropertyNames() ) {
			map.put(key, properties.getProperty(key));
			}
			System.out.println(map);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("config", map);
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
		inserted(em);  
//		read(em);
//		update(em);
//		delete(em);
		
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
