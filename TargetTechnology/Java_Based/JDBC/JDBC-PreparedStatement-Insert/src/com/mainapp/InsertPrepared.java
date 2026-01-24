package com.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrepared {
	
	
	public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/JDBC";
        String user = "root";
        String pass = "Hacker@anuj001";

        String sql = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, 101);
            ps.setString(2, "Amit");
            ps.setDouble(3, 50000);

            int rows = ps.executeUpdate();
            System.out.println(rows + " record inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
