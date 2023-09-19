package jdbc.init;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentCreator {
    private void createDeoartments() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "INSERT INTO departments (name) VALUES (?), (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, "IT");
            preparedStatement.setString(2, "HR");
            preparedStatement.executeUpdate();
        }
    }

    void initialization() {
        try {
            createDeoartments();
            System.out.println("Departments created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
