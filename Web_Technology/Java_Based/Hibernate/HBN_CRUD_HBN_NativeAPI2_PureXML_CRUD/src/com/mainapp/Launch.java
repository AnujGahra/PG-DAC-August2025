package com.mainapp;

import java.io.InputStream;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.mainapp.entity.Employee;

class Launch {

	public static void main(String[] args) {

		Session session = connection();

		if (session != null) {
			System.out.println("OK");

//			update(session);

			delete(session);

		}

//		insert(session); // for insert data

//		read(session);

	}

	private static void delete(Session session) {
		Transaction transaction = session.getTransaction();
		transaction.begin();

		Employee employee = session.get(Employee.class, 1001);

		if (employee != null) {
			session.delete(employee);
			System.out.println("DELETED");
		}

		transaction.commit();
	}

	private static void update(Session session) {
		Transaction transaction = session.getTransaction();
		transaction.begin();

		Employee employee = session.get(Employee.class, 1001);

		if (employee != null) {
			employee.setEsalary(1234566);
			session.update(employee);
			System.out.println("UPDATED");
		}

		transaction.commit();
	}

	private static void read(Session session) {
		// Employee employee = session.get(Employee.class, 1001);
		// int userInput = 1010;
		// if(userInput == 1111) {
		// System.out.println(employee);
		// } else {
		// System.out.println("WRONG KEY");
		// }

		Employee employee = session.load(Employee.class, 1001);
		System.out.println(employee.getClass());
		int userInput = 1010;
		if (userInput == 1111) {

			System.out.println(employee);
		} else {
			System.out.println("Wrong Key");
		}
	}

	private static void insert(Session session) {
		Transaction transaction = session.getTransaction();
		transaction.begin();

		Employee employee = new Employee(10, "raju", "add1", 1000);
		session.save(employee);
		System.out.println("DATA INSERTED");
		transaction.commit();
	}

	private static Session connection() {
		try {

			Configuration configuration = new Configuration();
			configuration.configure();

			SessionFactory sessionFactory = configuration.buildSessionFactory();

			Session session = sessionFactory.openSession();

			System.out.println(session);

			return session;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
