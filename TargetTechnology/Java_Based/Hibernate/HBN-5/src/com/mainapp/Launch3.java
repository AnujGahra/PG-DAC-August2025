package com.mainapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.entity.Employee;

public class Launch3 {

    // Criteria API (JPQL alternative)
    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("config");

        EntityManager em = emf.createEntityManager();

        // insert(em);
        // read(em);
        // update(em);
        delete(em);

        em.close();
        emf.close();
    }

    // ---------------- BULK DELETE ----------------
    private static void delete(EntityManager em) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaDelete<Employee> cd =
                cb.createCriteriaDelete(Employee.class);

        Root<Employee> root = cd.from(Employee.class);

        cd.where(cb.lessThan(root.get("eid"), 905));

        Query query = em.createQuery(cd);
        query.executeUpdate();

        transaction.commit();

        System.out.println("BULK DATA DELETED");
    }

    // ---------------- BULK UPDATE ----------------
    private static void update(EntityManager em) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate<Employee> cu =
                cb.createCriteriaUpdate(Employee.class);

        Root<Employee> root = cu.from(Employee.class);

        cu.set("esalary", 6000);              // SET esalary = 6000
        cu.where(cb.lessThan(root.get("eid"), 905)); // WHERE eid < 905

        Query query = em.createQuery(cu);
        query.executeUpdate();

        transaction.commit();

        System.out.println("BULK DATA UPDATED");
    }

    // ---------------- READ ----------------
    private static void read(EntityManager em) {

        // SELECT eid, ename FROM Employee
        // WHERE ename LIKE 'j%' AND eid > 905

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Employee> cq =
                cb.createQuery(Employee.class);

        Root<Employee> root = cq.from(Employee.class);

        Predicate p1 = cb.like(root.get("ename"), "j%");
        Predicate p2 = cb.greaterThan(root.get("eid"), 905);

        cq.multiselect(root.get("eid"), root.get("ename"))
          .where(cb.and(p1, p2));

        List<Employee> list = em.createQuery(cq).getResultList();

        System.out.println(list);
    }

    // ---------------- BULK INSERT ----------------
    private static void insert(EntityManager em) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        for (int i = 1; i <= 10; i++) {

            Employee employee =
                    new Employee(900 + i, "jpqlname", "jpqladdr", 1000);

            em.persist(employee);

            if (i % 5 == 0) {
                em.flush();   // Synchronize persistence context with DB
                // em.clear(); // Optional: clear first-level cache
            }
        }

        transaction.commit();

        System.out.println("BULK DATA INSERTED");
    }
}
