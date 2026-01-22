package com.preparedStatementData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class readData {

	public static void main(String[] args) {
		
		
		
		// Database credentials
        String url = "jdbc:mysql://localhost:3306/jdbctest";
        String username = "root";
        String password = "Hacker@anuj001";

        // Query with placeholder
        String query = "SELECT id, name, age, city FROM students WHERE id > ?";

        try (
            // 1. Establish the connection
            Connection conn = DriverManager.getConnection(url, username, password);

            // 2. Create PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(query);
        ) {

            // 3. Set the placeholder value
            pstmt.setDouble(1, 1);  // salary > 30000

            // 4. Execute SELECT query
            ResultSet rs = pstmt.executeQuery();

            // 5. Process ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String city = rs.getString("city");

                System.out.println("ID: " + id +
                                   ", Name: " + name +
                                   ", age: " + age + " " + "city: " + city);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}
