package jdbc.init;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserCreator {
    private void createUser() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "INSERT INTO users (name, surname, department_id) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            // Перші троє користувачів належать до департменту IT (id = 1)
            for (int i = 1; i <= 3; i++) {
                preparedStatement.setString(1, "User" + i);
                preparedStatement.setString(2, "Surname" + i);
                preparedStatement.setInt(3, 1); // IT department
                preparedStatement.addBatch();
            }
            for (int i = 4; i <= 5; i++) {
                preparedStatement.setString(1, "User" + i);
                preparedStatement.setString(2, "Surname" + i);
                preparedStatement.setInt(3, 2); // HR department
                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
        }
    }
    public void initialization() {
        try {
            createUser();
            System.out.println("Users created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}