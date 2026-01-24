package com.mainapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StatementBatchExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/JDBC";
        String user = "root";
        String pass = "Hacker@anuj001";

        String sql = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(sql)) {

            con.setAutoCommit(false);

            // 1st batch
            ps.setInt(1, 401);
            ps.setString(2, "Ravi");
            ps.setDouble(3, 45000);
            ps.addBatch();

            // 2nd batch
            ps.setInt(1, 402);
            ps.setString(2, "Sita");
            ps.setDouble(3, 55000);
            ps.addBatch();

            // 3rd batch
            ps.setInt(1, 403);
            ps.setString(2, "Karan");
            ps.setDouble(3, 65000);
            ps.addBatch();

            ps.executeBatch();
            con.commit();

            System.out.println("Batch inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
