package tech.codehunt.crud;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionGactory {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbctest";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Hacker@anuj001";

    public static Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;

    }

    public static void close(AutoCloseable resource) {
        try {
            if (resource != null) {
                resource.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
