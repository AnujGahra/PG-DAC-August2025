package com.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Launch {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        try {
            // 1️⃣ Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️⃣ Create Connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbctest",
                    "root",
                    "Hacker@anuj001"
            );

            // 3️⃣ Create Statement
            stmt = con.createStatement();

            // 4️⃣ SQL to Create Table
            String createTableSQL =
                    "CREATE TABLE employeejdbc (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50) NOT NULL, " +
                    "salary DOUBLE NOT NULL" +
                    ")";

            // 5️⃣ Execute SQL
            stmt.execute(createTableSQL);

            System.out.println("Table 'employee' created successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
