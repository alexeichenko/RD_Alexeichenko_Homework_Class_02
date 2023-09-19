package jdbc_homework_fist_part.service;

import jdbc_homework_fist_part.crud.CountryManager;
import jdbc_homework_fist_part.first_model.Country;

import java.sql.SQLException;

public class CountryService {
    private CountryManager countryManager;

    public CountryService() {
        this.countryManager = countryManager;
    }
    public void createCountry(Country country) throws SQLException {
        countryManager.insertCountry(country);
    }
    public Country getCountryById(int id) throws SQLException {
        return countryManager.findCountryById(id);
    }
    public void updateCountry(Country country) throws SQLException {
        countryManager.updateCountry(country);
    }
    public void deleteCountry(int id) throws SQLException {
        countryManager.deleteCountry(id);
    }
}
