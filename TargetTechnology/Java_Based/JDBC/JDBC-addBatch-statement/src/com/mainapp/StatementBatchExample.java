package com.mainapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementBatchExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/JDBC";
        String user = "root";
        String pass = "Hacker@anuj001";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement stmt = con.createStatement()) {

            // Disable auto-commit for transaction
            con.setAutoCommit(false);

            stmt.addBatch("INSERT INTO employee VALUES (301, 'Aman', 45000)");
            stmt.addBatch("INSERT INTO employee VALUES (302, 'Neha', 52000)");
            stmt.addBatch("UPDATE employee SET salary = 60000 WHERE id = 301");
            stmt.addBatch("DELETE FROM employee WHERE id = 302");

            int[] results = stmt.executeBatch();
            con.commit();

            System.out.println("Batch executed successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}