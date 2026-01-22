package com.mainApp;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Launch {

    public static void main(String[] args) {
    	
    	
    	HikariDataSource hikariDataSource = null;
    	
    	
    	try {
        	Properties properties = new Properties();
          FileInputStream fis = new FileInputStream(
                  "myConfig.properties"
          );
          properties.load(fis);
          
//          CONNECTIONS DETAILS ---------> HIKARI
          HikariConfig hikariConfig = new HikariConfig();

          hikariConfig.setJdbcUrl((String) properties.get("mysql.url"));
          hikariConfig.setUsername((String) properties.get("mysql.user"));
          hikariConfig.setPassword((String) properties.get("mysql.pass"));

          hikariConfig.setMinimumIdle(20);
          hikariConfig.setMaximumPoolSize(100);

          // POOL READY
          hikariDataSource = new HikariDataSource(hikariConfig);

          // GET CONNECTION FROM POOL
          Connection connection = hikariDataSource.getConnection();
          System.out.println(connection);

          // RETURN CONNECTION TO POOL
          connection.close();


    	} catch (Exception e) {
    		
    	}
    	
    	

//        try {
//            // Load properties file
//            
//
//            while (true) {
//            	Properties properties = new Properties();
//                FileInputStream fis = new FileInputStream(
//                        "/Users/anujgahra/Developer/PG-DAC/Web_Technology/Java_Based/JDBC/Properties/src/myConfig.properties"
//                );
//                properties.load(fis);
//
//                // Read values from properties file
//                String url = properties.getProperty("mysql.url");
//                String user = properties.getProperty("mysql.user");
//                String pass = properties.getProperty("mysql.pass");
//
//                // Create connection
//                Connection connection = DriverManager.getConnection(url, user, pass);
//
//                // Print connection info
//                System.out.println(connection + " -> " + connection.getCatalog());
//
//                // Sleep 2 seconds
////                Thread.sleep(2000);
//
//                // Close connection
//                connection.close();
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
