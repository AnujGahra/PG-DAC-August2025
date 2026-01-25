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

		insert(em);
		read(em);
		update(em);
		delete(em);
	}

	// DELETE (JPQL)
	private static void delete(EntityManager em) {

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		String hql = "delete from Employee e where e.id = :id";

		Query query = em.createQuery(hql);
		query.setParameter("id", 1005);

		query.executeUpdate();
		transaction.commit();

		System.out.println("Data Deleted");
	}

	// UPDATE (JPQL)
	private static void update(EntityManager em) {

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		String hql = "update Employee e set e.salary = :salary where e.id = :id";

		Query query = em.createQuery(hql);
		query.setParameter("salary", 99999);
		query.setParameter("id", 1003);

		query.executeUpdate();
		transaction.commit();

		System.out.println("Data Updated");
	}

	// READ (JPQL)
	private static void read(EntityManager em) {

		String hql = "from Employee"; // JPQL

		Query query = em.createQuery(hql);
		List<Employee> list = query.getResultList();

		for (Employee emp : list) {
			System.out.println(emp);
		}

		System.out.println("Data Fetched");
	}

	// INSERT (You already wrote it — unchanged)
	private static void insert(EntityManager em) {

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		for (int i = 1001; i <= 1010; i++) {
			Employee employee = new Employee(i, "name" + i, "add" + i, 1000 + i);
			em.persist(employee);
		}

		transaction.commit();
		System.out.println("Data Inserted");
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
					.createContainerEntityManagerFactory(new PersistenceUnitInfoIml(), map);

			entityManager = entityManagerFactory.createEntityManager();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return entityManager;
	}
}
