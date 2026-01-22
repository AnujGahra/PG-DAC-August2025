package com.mainApp;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Launch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Connection con = null;

        try {
            String url = "jdbc:mysql://localhost:3306";
            String username = "root";
            String password = "";

            con = DriverManager.getConnection(url, username, password);

            // FACTORY DESIGN PATTERN
            DatabaseMetaData metaData = con.getMetaData();

            String url2 = metaData.getURL();
            System.out.println(url2);

            String userName2 = metaData.getUserName();
            System.out.println(userName2);

            String databaseProductName = metaData.getDatabaseProductName();
            String databaseProductVersion = metaData.getDatabaseProductVersion();

            int databaseMajorVersion = metaData.getDatabaseMajorVersion();
            int databaseMinorVersion = metaData.getDatabaseMinorVersion();

            System.out.println(databaseProductName);
            System.out.println(databaseProductVersion);
            System.out.println(databaseMajorVersion);
            System.out.println(databaseMinorVersion);

            String driverName = metaData.getDriverName();
            String driverVersion = metaData.getDriverVersion();

            int driverMajorVersion = metaData.getDriverMajorVersion();
            int driverMinorVersion = metaData.getDriverMinorVersion();

            System.out.println(driverName);
            System.out.println(driverVersion);
            System.out.println(driverMajorVersion);
            System.out.println(driverMinorVersion);

            int maxUserNameLength = metaData.getMaxUserNameLength();
            System.out.println(maxUserNameLength);

            int maxColumnsInTable = metaData.getMaxColumnsInTable();
            System.out.println(maxColumnsInTable);

            int maxRowSize = metaData.getMaxRowSize();
            System.out.println(maxRowSize);

        } catch (Exception e) {
        			
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

            e.printStackTrace();
        }
    }
}
