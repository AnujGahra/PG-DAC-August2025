package com.usingPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Launch {

	public static void main(String[] args) {
		
		
		String url = "jdbc:mysql://localhost:3306/jdbctest";
        String username = "root";
        String password = "Hacker@anuj001";

        // Delete student with id = 3
        int id = 3;

        // Safe parameterized query
        String query = "DELETE FROM students WHERE id = ?";

        try (
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = conn.prepareStatement(query)
        ) {

            pstmt.setInt(1, id);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row deleted using PreparedStatement.");

        } catch (SQLException e) {
            e.printStackTrace();
        }

	}

}
