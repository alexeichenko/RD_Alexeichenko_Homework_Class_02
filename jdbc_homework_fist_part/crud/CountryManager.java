package jdbc_homework_fist_part.crud;

import jdbc.init.DatabaseConnection;
import jdbc_homework_fist_part.first_model.Country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryManager {
    public void insertCountry(Country country) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "INSERT INTO country (name) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, country.getName());
            preparedStatement.executeUpdate();
        }
    }
    public void updateCountry(Country country) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "UPDATE country SET name = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, country.getName());
            preparedStatement.setInt(2, country.getId());
            preparedStatement.executeUpdate();
        }
    }
    public void deleteCountry(int countryId) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "DELETE FROM country WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, countryId);
            preparedStatement.executeUpdate();
        }
    }
    public Country findCountryById(int countryId) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();

        String sql = "SELECT * FROM country WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, countryId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Country country = new Country();
                country.setId(resultSet.getInt("id"));
                country.setName(resultSet.getString("name"));
                return country;
            }
        }
        return null; // повертаємо null, якщо департамент не знайдено
    }
}
