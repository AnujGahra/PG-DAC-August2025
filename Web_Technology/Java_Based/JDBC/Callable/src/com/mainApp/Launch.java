package com.mainApp;

import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class Launch {
    public static void main(String[] args) {
        Connection con = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;

        try {
            // Load and register MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/companydb";
            String username = "root";
            String password = "Hacker@anuj001";  // your MySQL password

            // Connect to DB
            con = DriverManager.getConnection(url, username, password);

            // Prepare stored procedure call
            String query = "{ call getEmployeeByUsername(?) }";
            callableStatement = con.prepareCall(query);

            // Set parameter for procedure
            callableStatement.setString(1, "anuj123");

            // Execute stored procedure
            resultSet = callableStatement.executeQuery();

            // Display output
            if (resultSet.next()) {
                System.out.println("SN       : " + resultSet.getInt("sn"));
                System.out.println("USERNAME : " + resultSet.getString("username"));
                System.out.println("PASSWORD : " + resultSet.getString("password"));
                System.out.println("FULLNAME : " + resultSet.getString("fullname"));
                System.out.println("ADDRESS  : " + resultSet.getString("address"));
                System.out.println("SALARY   : " + resultSet.getInt("salary"));
            } else {
                System.out.println("User Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (callableStatement != null) callableStatement.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
