package lesson24.Online24.entity;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbRunner {
    private static final Properties DB_SETTINGS = new Properties();

    static {
        try {
            DB_SETTINGS.load(DbRunner.class.getResourceAsStream("/db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException, IOException {
        System.out.println(getEmployeeById(4));
    }

    private static List<Employee> getEmployeeById(Integer id) throws SQLException {
        try(final Connection connection = DriverManager.getConnection(
                DB_SETTINGS.getProperty("jdbc.url"),
                DB_SETTINGS.getProperty("db.login"),
                DB_SETTINGS.getProperty("db.password"));
            final PreparedStatement statement = connection.prepareStatement(
                    """
                    select e.emp_id, e.emp_name, e.salary, d.name department_name
                    from employee e
                    left join department d 
                    on e.department_id = d.id
                    where e.emp_id = ?
                    """)
            ) {
            statement.setInt(1,id);
            List<Employee> employees = new ArrayList<>();
            try( final ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    Employee employee = new Employee(resultSet.getInt("emp_id"),
                            resultSet.getString("emp_name"),
                            resultSet.getBigDecimal("salary"),
                            resultSet.getString("department_name"));
                    employees.add(employee);
                }
            }
            return employees;
        }
    }
}

