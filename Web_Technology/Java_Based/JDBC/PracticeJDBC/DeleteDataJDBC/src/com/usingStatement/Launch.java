package com.usingStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Launch {

	public static void main(String[] args) {
		
		
		String url = "jdbc:mysql://localhost:3306/jdbctest";
        String username = "root";
        String password = "Hacker@anuj001";

        // Delete student with id = 3
        int id = 3;

        // Unsafe query (Statement builds it as text)
        String query = "DELETE FROM students WHERE id = " + id;

        try (
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement()
        ) {

            int rows = stmt.executeUpdate(query);
            System.out.println(rows + " row deleted using Statement.");

        } catch (SQLException e) {
            e.printStackTrace();
        }

	}

}
