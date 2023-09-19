package jdbc_homework_fist_part.fetch;

import jdbc.init.DatabaseConnection;
import jdbc_homework_fist_part.first_model.City;
import jdbc_homework_fist_part.first_model.Country;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CityWithCountryFetcher {
    public List<City> fetchCityWithCountry() throws SQLException {
        List<City> cities = new ArrayList<>();
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String sql = "SELECT ci.id as city_id, ci.name as city_name, ci.towards, ci.population, co.id as country_id, co.name as country_name " +
                "FROM city ci " +
                "JOIN country co ON ci.country_id = co.id";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Country country = new Country();
                country.setId(resultSet.getInt("country_id"));
                country.setName(resultSet.getString("country_name"));

                City city = new City();
                city.setId(resultSet.getInt("city_id"));
                city.setName(resultSet.getString("city_name"));
                city.setTowards(resultSet.getString("towards"));
                city.setPopulation(resultSet.getInt("population"));
                city.setCountry(country);

                cities.add(city);
            }
        }
        return cities;
    }
}
