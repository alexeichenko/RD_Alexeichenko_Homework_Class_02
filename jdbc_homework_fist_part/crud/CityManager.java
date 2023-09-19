package jdbc_homework_fist_part.crud;

import jdbc.init.DatabaseConnection;
import jdbc_homework_fist_part.first_model.City;
import jdbc_homework_fist_part.first_model.Country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityManager {
    public void insertCit(City city) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "INSERT INTO city (name, towards, population, country_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, city.getName());
            preparedStatement.setString(2, city.getTowards());
            preparedStatement.setInt(3, city.getPopulation());
            preparedStatement.setInt(4, city.getCountry().getId());
            preparedStatement.executeUpdate();
        }
    }

    public void updateCity(City city) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "UPDATE city SET name = ?, towards = ?, population = ?, country_id = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, city.getName());
            preparedStatement.setString(2, city.getTowards());
            preparedStatement.setInt(3, city.getPopulation());
            preparedStatement.setInt(4, city.getCountry().getId());
            preparedStatement.setInt(5, city.getId());
            preparedStatement.executeUpdate();
        }
    }

    public void deleteCity(int cityId) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "DELETE FROM city WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, cityId);
            preparedStatement.executeUpdate();
        }
    }

    public City findByCityId (int cityId) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT ci.id, ci.name, ci.towards, ci.population, co.id as country_id, co.name as country_name " +
                "FROM city ci " +
                "JOIN country co ON ci.country_id = co.id " +
                "WHERE ci.id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, cityId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Country country = new Country();
                country.setId(resultSet.getInt("country_id"));
                country.setName(resultSet.getString("country_name"));

                City city = new City();
                city.setId(resultSet.getInt("id"));
                city.setName(resultSet.getString("name"));
                city.setTowards(resultSet.getString("towards"));
                city.setPopulation(resultSet.getInt("population"));
                city.setCountry(country);
                return city;
            }
        }
        return null;
    }
}
