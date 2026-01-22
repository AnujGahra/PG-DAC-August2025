package com.mainApp;

import java.sql.DriverManager;
import java.sql.Connection;

public class Launch {
	public static void main(String[] args) {
		try
		{
//			MySql Driver Loaded and Register
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306";
			String username="root";
			String password="Hacker@anuj001";
			
//			FACTORY DESIGN PATTERN
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println(con);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}

