package com.mainapp;

import java.io.InputStream;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

class Launch {

	public static void main(String[] args) {

		try {
//			InputStream is = Launch.class.getClassLoader().getResourceAsStream("config.properties");
			Properties properties = new Properties();
//			properties.load(is);
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Hacker@anuj001");
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			Configuration configuration = new Configuration();
//	configuration.configure();
			configuration.setProperties(properties);

			SessionFactory sessionFactory = configuration.buildSessionFactory();

			Session session = sessionFactory.openSession();

			System.out.println(session);
		} catch (Exception e) {

		}

	}
}
