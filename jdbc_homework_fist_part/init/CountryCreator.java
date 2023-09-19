package jdbc_homework_fist_part.init;

import jdbc.init.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CountryCreator {
    private void createCountry() throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "INSERT INTO country (name) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, "Ukraine");
            preparedStatement.executeUpdate();
        }
    }

    public void countryInitialization() {
        try {
            createCountry();
            System.out.println("Country created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
