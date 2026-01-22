package com.readData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/jdbctest";
		String username = "root";
		String password = "Hacker@anuj001";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			connection = DriverManager.getConnection(url, username, password);
			
//			System.out.println(connection);
			
			statement = connection.createStatement();
			
			String sql = "SELECT * FROM students";
			
			resultSet = statement.executeQuery(sql);
			
			ResultSetMetaData meta = resultSet.getMetaData();
			int columnCount = meta.getColumnCount();
			
			
//			Print all rows
			while(resultSet.next()) {
				for(int i = 1; i<= columnCount; i++) {
					String columnName = meta.getColumnName(i);
					String value = resultSet.getString(i);
					
					System.out.println(columnName + ": " + value + " ");
				}
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Database connection failed.");
			e.printStackTrace();
		} finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("Connection Closed Successfully");
				}
				if(statement != null) statement.close();
				if(resultSet != null) resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
