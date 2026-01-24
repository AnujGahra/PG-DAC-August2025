package com.mainapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		
		
		
		String url = "jdbc:mysql://localhost:3306/JDBC";
        String user = "root";
        String pass = "password";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            String sql = "INSERT INTO employee VALUES (101, 'Rahul', 45000)";

            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " record inserted");

            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


	}

}
