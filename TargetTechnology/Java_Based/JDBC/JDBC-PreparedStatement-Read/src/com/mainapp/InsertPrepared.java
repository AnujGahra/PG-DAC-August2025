package com.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertPrepared {
	
	
	public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/JDBC";
        String user = "root";
        String pass = "Hacker@anuj001";

        String sql = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = con.prepareStatement(sql)) {

               ps.setInt(1, 101);

               ResultSet rs = ps.executeQuery();

               while (rs.next()) {
                   System.out.println(
                       rs.getInt("id") + " " +
                       rs.getString("name") + " " +
                       rs.getDouble("salary")
                   );
               }

           } catch (Exception e) {
               e.printStackTrace();
           }
    }

}
