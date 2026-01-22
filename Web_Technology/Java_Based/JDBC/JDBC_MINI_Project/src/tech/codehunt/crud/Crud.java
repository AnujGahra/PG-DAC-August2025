package tech.codehunt.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tech.codehunt.dto.EmployeeDTO;

public class Crud {

    public Crud() {
        // TABLE CREATION
        createTable();
    }

    public void createTable() { // SN, User, Pass, FullName, Address, Salary
        Connection connection = null;
        Statement statement = null;

        try {
            connection = ConnectionGactory.getConnection();

            String sql = "CREATE TABLE IF NOT EXISTS employee ("
                    + "SN INT AUTO_INCREMENT PRIMARY KEY, "
                    + "USERNAME VARCHAR(30) NOT NULL UNIQUE, "
                    + "PASSWORD VARCHAR(30), "
                    + "FULLNAME VARCHAR(100), "
                    + "ADDRESS VARCHAR(200), "
                    + "SALARY INT"
                    + ");";

            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionGactory.close(connection);
            ConnectionGactory.close(statement);
        }
    }

    // INSERT DATA
    public void insert(EmployeeDTO employeeDTO) {

        Connection connection = null;
        Statement statement = null;

        try {
            String sql = "INSERT INTO employee(username, password, fullname, address, salary) "
                    + "VALUES('" + employeeDTO.getUsername() + "', '"
                    + employeeDTO.getPassword() + "', '"
                    + employeeDTO.getFullname() + "', '"
                    + employeeDTO.getAddress() + "', "
                    + employeeDTO.getSalary() + ")";

            connection = ConnectionGactory.getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("DATA INSERTED");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionGactory.close(statement);
            ConnectionGactory.close(connection);
        }
    }

    // READ DATA
    public void read(String username, String password) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            String sql = "SELECT * FROM employee WHERE username='" + username + 
                         "' AND password='" + password + "'";

            connection = ConnectionGactory.getConnection();
            statement = connection.createStatement();

            resultSet = statement.executeQuery(sql);

            if (resultSet.next()) { // ONLY CALL ONCE

                int getSn = resultSet.getInt("sn");
                String getUsername = resultSet.getString("username");
                String getPassword = resultSet.getString("password");
                String getFullname = resultSet.getString("fullname");
                String getAddress = resultSet.getString("address");
                int getSalary = resultSet.getInt("salary");

                System.out.println("SN: " + getSn);
                System.out.println("USERNAME: " + getUsername);
                System.out.println("PASSWORD: " + getPassword);
                System.out.println("FULLNAME: " + getFullname);
                System.out.println("ADDRESS: " + getAddress);
                System.out.println("SALARY: " + getSalary);

            } else {
                System.out.println("User not found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	ConnectionGactory.close(resultSet);
            ConnectionGactory.close(statement);
            ConnectionGactory.close(connection);
        }
    }

    // UPDATE DATA
    public void update(String username, int salary) {

        Connection connection = null;
        Statement statement = null;

        try {
            String sql = "UPDATE employee SET salary = " + salary +
                         " WHERE username = '" + username + "'";

            connection = ConnectionGactory.getConnection();
            statement = connection.createStatement();

            int executeUpdate = statement.executeUpdate(sql);

            if (executeUpdate > 0) {
                System.out.println("DATA UPDATED");
            } else {
                System.out.println("USER NOT FOUND");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionGactory.close(statement);
            ConnectionGactory.close(connection);
        }
    }

    // DELETE DATA
    public void delete(String username) {

        Connection connection = null;
        Statement statement = null;

        try {
            String sql = "DELETE FROM employee WHERE username = '" + username + "'";

            connection = ConnectionGactory.getConnection();
            statement = connection.createStatement();

            int executeUpdate = statement.executeUpdate(sql);

            if (executeUpdate > 0) {
                System.out.println("DATA DELETED");
            } else {
                System.out.println("USER NOT FOUND");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionGactory.close(statement);
            ConnectionGactory.close(connection);
        }
    }
}
