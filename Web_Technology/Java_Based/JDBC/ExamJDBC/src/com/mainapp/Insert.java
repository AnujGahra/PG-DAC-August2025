package com.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        try {
            // 1️⃣ Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️⃣ Create Connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "Hacker@anuj001"
            );

            // 3️⃣ Create Statement
            stmt = con.createStatement();

            // ================= CREATE =================
            String insertSQL =
                    "INSERT INTO employee(name, salary) VALUES ('Amit', 30000)";

            int insertCount = stmt.executeUpdate(insertSQL);
            System.out.println("Inserted Rows: " + insertCount);

            // ================= READ =================
            String selectSQL = "SELECT * FROM employee";

            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("Employee Data:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getDouble("salary")
                );
            }

            // ================= UPDATE =================
            String updateSQL =
                    "UPDATE employee SET salary = 45000 WHERE name = 'Amit'";

            int updateCount = stmt.executeUpdate(updateSQL);
            System.out.println("Updated Rows: " + updateCount);

            // ================= DELETE =================
            String deleteSQL =
                    "DELETE FROM employee WHERE name = 'Amit'";

            boolean result = stmt.execute(deleteSQL);
            System.out.println("Delete executed: " + !result);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
