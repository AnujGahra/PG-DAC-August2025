package tech.codehunt.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tech.codehunt.dto.EmployeeDTO;

public class Crud {

    public Crud() {
        createTable();
    }

    public void createTable() {   // SN, USER, PASS, FULLNAME, ADDRESS, SALARY
        Connection connection = null;
        Statement statement = null;

        try {
            connection = ConnectionGactory.getConnection();

            String sql = "CREATE TABLE IF NOT EXISTS employee ("
                    + "sn INT AUTO_INCREMENT PRIMARY KEY, "
                    + "username VARCHAR(30) NOT NULL UNIQUE, "
                    + "password VARCHAR(30), "
                    + "fullname VARCHAR(100), "
                    + "address VARCHAR(200), "
                    + "salary INT"
                    + ")";

            statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("TABLE CREATED");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionGactory.close(statement);
            ConnectionGactory.close(connection);
        }
    }

    public void insert(EmployeeDTO employeeDTO) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            String sql = "INSERT INTO employee(username, password, fullname, address, salary) "
                    + "VALUES(?,?,?,?,?)";

            connection = ConnectionGactory.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            int count = 1;
            while (count <= 5) {
                preparedStatement.setString(1, employeeDTO.getUsername() + count);
                preparedStatement.setString(2, employeeDTO.getPassword());
                preparedStatement.setString(3, employeeDTO.getFullname());
                preparedStatement.setString(4, employeeDTO.getAddress());
                preparedStatement.setInt(5, employeeDTO.getSalary());

                preparedStatement.executeUpdate();
                System.out.println("DATA INSERTED");
                count++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionGactory.close(preparedStatement);
            ConnectionGactory.close(connection);
        }
    }

    public void read(String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String sql = "SELECT * FROM employee WHERE username = ? AND password = ?";

            connection = ConnectionGactory.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int sn = resultSet.getInt("sn");
                String user = resultSet.getString("username");
                String pass = resultSet.getString("password");
                String fullname = resultSet.getString("fullname");
                String address = resultSet.getString("address");
                int salary = resultSet.getInt("salary");

                System.out.println("SN: " + sn);
                System.out.println("USERNAME: " + user);
                System.out.println("PASSWORD: " + pass);
                System.out.println("FULLNAME: " + fullname);
                System.out.println("ADDRESS: " + address);
                System.out.println("SALARY: " + salary);

            } else {
                System.out.println("USER NOT FOUND");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionGactory.close(resultSet);
            ConnectionGactory.close(preparedStatement);
            ConnectionGactory.close(connection);
        }
    }

    public void update(String username, int salary) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            String sql = "UPDATE employee SET salary = ? WHERE username = ?";

            connection = ConnectionGactory.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, salary);
            preparedStatement.setString(2, username);

            int executeUpdate = preparedStatement.executeUpdate();

            if (executeUpdate > 0) {
                System.out.println("DATA UPDATED");
            } else {
                System.out.println("USER NOT FOUND");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionGactory.close(preparedStatement);
            ConnectionGactory.close(connection);
        }
    }

    public void delete(String username) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            String sql = "DELETE FROM employee WHERE username = ?";

            connection = ConnectionGactory.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, username);

            int executeUpdate = preparedStatement.executeUpdate();

            if (executeUpdate > 0) {
                System.out.println("DATA DELETED");
            } else {
                System.out.println("USER NOT FOUND");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionGactory.close(preparedStatement);
            ConnectionGactory.close(connection);
        }
    }

    public void test(String sql) {  
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionGactory.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            boolean execute = preparedStatement.execute();

            if (execute) {
                ResultSet resultSet = preparedStatement.getResultSet();

                if (resultSet.next()) {
                    System.out.println("SN: " + resultSet.getInt("sn"));
                    System.out.println("USERNAME: " + resultSet.getString("username"));
                    System.out.println("PASSWORD: " + resultSet.getString("password"));
                    System.out.println("FULLNAME: " + resultSet.getString("fullname"));
                    System.out.println("ADDRESS: " + resultSet.getString("address"));
                    System.out.println("SALARY: " + resultSet.getInt("salary"));
                } else {
                    System.out.println("USER NOT FOUND");
                }

            } else {
                int count = preparedStatement.getUpdateCount();
                System.out.println(count);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionGactory.close(preparedStatement);
            ConnectionGactory.close(connection);
        }
    }
}
