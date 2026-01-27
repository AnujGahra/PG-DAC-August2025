package com.mainapp;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.hibernate.jpa.HibernatePersistenceProvider;

import com.entity.Employee;
import com.entity.PersistenceUnitInfoImpl;

public class Launch {

    public static void main(String[] args) {

        Properties properties = new Properties();
        InputStream is = null;

        try {
            is = Launch.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            if (is == null) {
                System.out.println("FILE NOT FOUND");
                return;
            }

            properties.load(is);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Map<String, String> map = new HashMap<>();

        for (String key : properties.stringPropertyNames()) {
            map.put(key, properties.getProperty(key));
        }

        System.out.println(map);

        EntityManagerFactory emf =
                new HibernatePersistenceProvider()
                        .createContainerEntityManagerFactory(
                                new PersistenceUnitInfoImpl(),
                                map
                        );

        EntityManager em = emf.createEntityManager();

        insert(em);
        // read(em);
        // update(em);
        // delete(em);

        em.close();
        emf.close();
    }

    private static void insert(EntityManager em) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        Employee employee =
                new Employee(450, "kaju", "kkr", 2000);

        em.persist(employee);

        transaction.commit();
        System.out.println("DATA INSERTED SUCCESSFULLY");
    }

    private static void read(EntityManager em) {
        Employee employee = em.find(Employee.class, 11);
        System.out.println(employee);
    }

    private static void update(EntityManager em) {
        Employee employee = em.find(Employee.class, 11);

        if (employee != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();

            employee.setEsalary(8000);
            em.merge(employee);

            transaction.commit();
            System.out.println("DATA UPDATED SUCCESSFULLY");
        } else {
            System.out.println("DATA NOT FOUND");
        }
    }

    private static void delete(EntityManager em) {
        Employee employee = em.find(Employee.class, 11);

        if (employee != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();

            em.remove(employee);

            transaction.commit();
            System.out.println("DATA DELETED SUCCESSFULLY");
        } else {
            System.out.println("DATA NOT FOUND");
        }
    }
}
