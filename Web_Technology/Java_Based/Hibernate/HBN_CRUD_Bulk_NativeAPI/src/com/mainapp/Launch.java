package com.mainapp;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.jpa.HibernatePersistenceProvider;

import com.mainapp.entity.Employee;

public class Launch {

	public static void main(String[] args) {

		EntityManager em = connection();
		System.out.println(em);

		// INSERT
		
		
		EntityTransaction transaction = em.getTransaction();
		transaction.begin(); // FIX 1
//
//        String sql = "insert into xemployee(id, name, address, salary) values(?,?,?,?)";
//
//		for (int i = 1; i <= 5; i++) {
//			Query query = em.createNativeQuery(sql);
//			query.setParameter(1, 11 + i);
//			query.setParameter(2, "Anuj" + i);
//			query.setParameter(3, "add1" + i);
//			query.setParameter(4, 1100000 + i);
//			query.executeUpdate();
//			System.out.println("Data Inserted");
//		}
//
//		transaction.commit();
		
		
		
//		EntityTransaction transaction = em.getTransaction();
//		transaction.begin(); // FIX 1
//
//
//		for (int i = 1; i <= 5; i++) {
//			Query query = em.createNamedQuery("insert");
//			query.setParameter(1, 11 + i);
//			query.setParameter(2, "Anuj" + i);
//			query.setParameter(3, "add1" + i);
//			query.setParameter(4, 1100000 + i);
//			query.executeUpdate();
//			System.out.println("Data Inserted");
//		}
//
//		transaction.commit();
		
		
		
//		Read data
//		Query query = em.createNamedQuery("read");
//		List<Object[]> list = query.getResultList();
//		
//		for(Object[] arr: list) {
//			for(Object o : arr) {
//				System.out.println(o);
//			}
//		}
//		System.out.println(list);
		
		
//		mathod - 2
//		Query query = em.createNamedQuery("read", Employee.class);
//		List <Employee> list = query.getResultList();
//		System.out.println(list);
		
		
//		Update 
//		Query query = em.createNamedQuery("update");
//		query.setParameter(1, 1200000);
//		query.setParameter(2, 340000);
//		query.executeUpdate();
//		System.out.println("Data Updated");
//		transaction.commit();
//		
		
//		Delete
		Query query = em.createNamedQuery("delete");
		query.setParameter(1, 340000);
		query.executeUpdate();
		System.out.println("Data Deleted");
		transaction.commit();


		
		
		
		
	}

	private static EntityManager connection() {

		EntityManager entityManager = null;
		try {
			InputStream is = Launch.class.getClassLoader().getResourceAsStream("config.properties");
			Properties properties = new Properties();
			properties.load(is);

			Map<String, String> map = new HashMap<String, String>();

			Set<String> set = properties.stringPropertyNames();

			for (String key : set) {
				map.put(key, properties.getProperty(key));
			}

			HibernatePersistenceProvider hibernatePersistenceProvider = new HibernatePersistenceProvider();
			EntityManagerFactory entityManagerFactory = hibernatePersistenceProvider
					.createContainerEntityManagerFactory(new PersistenceUnitInfoIml(), map); // FIX 2

			entityManager = entityManagerFactory.createEntityManager();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return entityManager;
	}
}
