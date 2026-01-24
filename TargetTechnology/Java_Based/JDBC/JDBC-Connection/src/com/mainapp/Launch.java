package com.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Launch {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/JDBC";
		String username = "root";
		String password = "Hacker@anuj001";

		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(url, username, password);
			System.out.println("✅ Database connected successfully!");

		} catch (ClassNotFoundException e) {
			System.out.println("❌ JDBC Driver not found");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("❌ Database connection failed");
			e.printStackTrace();

		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
