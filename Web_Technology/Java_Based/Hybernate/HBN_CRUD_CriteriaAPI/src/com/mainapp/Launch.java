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
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;

import org.hibernate.jpa.HibernatePersistenceProvider;

import com.mainapp.entity.Employee;

public class Launch {

	public static void main(String[] args) {

		EntityManager em = connection();
		System.out.println(em);

//		insert(em);
		read(em);
//		update(em);
//		delete(em);
	}

	// DELETE using CriteriaDelete
	private static void delete(EntityManager em) {

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaDelete<Employee> delete = cb.createCriteriaDelete(Employee.class);

		Root<Employee> root = delete.from(Employee.class);

		delete.where(cb.equal(root.get("id"), 1005));

		em.createQuery(delete).executeUpdate();

		transaction.commit();
		System.out.println("Data Deleted");
	}

	// UPDATE using CriteriaUpdate
	private static void update(EntityManager em) {

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaUpdate<Employee> update = cb.createCriteriaUpdate(Employee.class);

		Root<Employee> root = update.from(Employee.class);

		update.set("salary", 55555);
		update.where(cb.equal(root.get("id"), 1003));

		em.createQuery(update).executeUpdate();

		transaction.commit();
		System.out.println("Data Updated");
	}

	// READ using CriteriaQuery
	private static void read(EntityManager em) {

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

		Root<Employee> root = cq.from(Employee.class);
		cq.select(root);

		TypedQuery<Employee> query = em.createQuery(cq);
		List<Employee> list = query.getResultList();

		for (Employee emp : list) {
			System.out.println(emp);
		}

		System.out.println("Data Fetched");
	}

	// INSERT (unchanged)
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

			Map<String, String> map = new HashMap<>();

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
