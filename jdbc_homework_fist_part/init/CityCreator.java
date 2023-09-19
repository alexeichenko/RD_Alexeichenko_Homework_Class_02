package jdbc_homework_fist_part.init;

import jdbc.init.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CityCreator {
    private void createCity() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "INSERT INTO city (name, towards, population, country_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            for (int i = 1; i <= 4; i++) {
                preparedStatement.setString(1, "City" + i);
                preparedStatement.setString(2, "Towards" + i);
                preparedStatement.setInt(3, 1000000 + i);
                preparedStatement.setInt(4, 1); // Country
                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
        }
    }

    public void cityInitialization() {
        try {
            createCity();
            System.out.println("City created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
