package CRUD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    public static final String JDBC_MYSQL = "jdbc:mysql://localhost:3306/employee";
    public static final String INSERT_INTO_EMPLOYEE_NAME_PASSWORD_EMAIL_COUNTRY_VALUES = "insert into Employee(name, password, email, country) values(?, ?, ?, ?)";
    public static final String UPDATE_EMPLOYEE_SET_NAME_PASSWORD_EMAIL_COUNTRY_WHERE_ID = "update employee set name=?, password=?, email=?, country=?, where id=?";
    public static final String DELETE_FROM_EMPLOYEE_WHERE_ID = "delete from employee where id=?";
    public static final String SELECT_FROM_EMPLOYEE_WHERE_ID = "select * from employee where id=?";
    public static final String SELECT_FROM_EMPLOYEE = "select * from employee";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.my.sql.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_MYSQL,"root","root");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static int save(Employee employee) {
        int status = 0;
        try {
            Connection connection = EmployeeDao.getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT_INTO_EMPLOYEE_NAME_PASSWORD_EMAIL_COUNTRY_VALUES);
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getPassword());
            statement.setString(3, employee.getEmail());
            statement.setString(4, employee.getCountry());

            status = statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return status;
    }

    public static int update(Employee employee) {
        int status = 0;
        try {
            Connection connection = EmployeeDao.getConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE_EMPLOYEE_SET_NAME_PASSWORD_EMAIL_COUNTRY_WHERE_ID);
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getPassword());
            statement.setString(3, employee.getEmail());
            statement.setString(4, employee.getCountry());

            status = statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return status;
    }

    public static int delete(int id) {
        int status = 0;
        try {
            Connection connection = EmployeeDao.getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE_FROM_EMPLOYEE_WHERE_ID);
            statement.setInt(1, id);

            status = statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return status;
    }

    public static Employee getEmployeeById(int id) {
        Employee employee = new Employee();
        try {
            Connection connection = EmployeeDao.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_FROM_EMPLOYEE_WHERE_ID);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                employee.setId(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setPassword(resultSet.getString(3));
                employee.setEmail(resultSet.getString(4));
                employee.setCountry(resultSet.getString(5));
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employee;
    }

    public static List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();

        try {
            Connection connection = EmployeeDao.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_FROM_EMPLOYEE);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setPassword(resultSet.getString(2));
                employee.setEmail(resultSet.getString(2));
                employee.setCountry(resultSet.getString(2));

                employees.add(employee);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }
}
