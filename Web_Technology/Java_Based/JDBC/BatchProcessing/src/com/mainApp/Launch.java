package com.mainApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Launch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Connection con = null;

        try {
            String url = "jdbc:mysql://localhost:3306/maybatch";
            String username = "root";
            String password = "Hacker@anuj001";

            con = DriverManager.getConnection(url, username, password);
            con.setAutoCommit(false);

            System.out.println(con);

            String sql = "INSERT INTO employee(username, password, fullname, address, salary) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            while (true) {

                System.out.println("ENTER USERNAME:");
                String user = scanner.next();

                System.out.println("ENTER PASSWORD:");
                String pass = scanner.next();
                scanner.nextLine();

                System.out.println("ENTER FULLNAME:");
                String fullname = scanner.nextLine();

                System.out.println("ENTER ADDRESS:");
                String address = scanner.nextLine();

                System.out.println("ENTER SALARY:");
                int salary = scanner.nextInt();

                preparedStatement.setString(1, user);
                preparedStatement.setString(2, pass);
                preparedStatement.setString(3, fullname);
                preparedStatement.setString(4, address);
                preparedStatement.setInt(5, salary);

                preparedStatement.addBatch();

                System.out.println("DO YOU WANT TO INSERT MORE? (Y/N):");
                String choice = scanner.next().trim().toUpperCase();

                if (!choice.equals("Y")) {
                    int[] result = preparedStatement.executeBatch();
                    System.out.println("ROWS INSERTED: " + result.length);
                    con.commit();
                    break;
                }
            }

        } catch (Exception e) {

            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException rollbackError) {
                rollbackError.printStackTrace();
            }

            e.printStackTrace();

        } finally {
            scanner.close();
        }
    }
}
