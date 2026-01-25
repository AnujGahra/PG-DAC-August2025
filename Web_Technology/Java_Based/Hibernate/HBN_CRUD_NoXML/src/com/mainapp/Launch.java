package com.mainapp;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.jpa.HibernatePersistenceProvider;

import com.mainapp.entity.Employee;

public class Launch {

	public static void main(String[] args) {
		
		try {
			InputStream is = Launch.class.getClassLoader().getResourceAsStream("config.properties");
			Properties properties = new Properties();
			properties.load(is);
			
			Map<String, String> map = new HashMap<String, String>();
			
			
			Set<String> set = properties.stringPropertyNames();
			
			for(String key : set) {
				map.put(key, properties.getProperty(key));
			}
//			
//			for(String key:set) {
//				String val = properties.getProperty(key);
//				System.out.println(key + "==== " + val);
//			}
			
			
			HibernatePersistenceProvider hibernatePersistenceProvider =  new HibernatePersistenceProvider();
			EntityManagerFactory entityManagerFactory = hibernatePersistenceProvider.createContainerEntityManagerFactory(new PersistenceUnitInfoIml(), map);
			

			EntityManager entityManager = entityManagerFactory.createEntityManager();

//			insert(entityManager);

			read(entityManager);

//			update(entityManager);

//			delete(entityManager); 

//			entityManager.close();
//			entityManagerFactory.close();

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myCon");

//		EntityManager entityManager = entityManagerFactory.createEntityManager();

//		insert(entityManager);

//		read(entityManager);

//		update(entityManager);

//		delete(entityManager); 

//		entityManager.close();
//		entityManagerFactory.close();

	}

	private static void delete(EntityManager entityManager) {
		Employee employee = entityManager.find(Employee.class, 11);
		if (employee != null) {
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.remove(employee);
			transaction.commit();
			System.out.println("Deleted");
		}
	}

	private static void update(EntityManager entityManager) {
		Employee employee = entityManager.find(Employee.class, 11);
		if (employee != null) {
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			employee.setEsalary(2000);
			entityManager.merge(employee);
			transaction.commit();
			System.out.println("Updated");
		} 
	}

	private static void read(EntityManager entityManager) {
		Employee employee = entityManager.find(Employee.class, 11);
		System.out.println(employee);
	}

	private static void insert(EntityManager entityManager) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		int eid = 11;
		String ename = "raju";
		String eaddress = "Moradabad";
		int esalary = 1000;

		Employee employee = new Employee(eid, ename, eaddress, esalary);
		entityManager.persist(employee);
		transaction.commit();

		System.out.println("INSERTED");
	}

}
