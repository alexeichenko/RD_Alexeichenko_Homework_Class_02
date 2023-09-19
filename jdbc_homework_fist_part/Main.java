package jdbc_homework_fist_part;

import jdbc_homework_fist_part.fetch.CityWithCountryFetcher;
import jdbc_homework_fist_part.first_model.City;
import jdbc_homework_fist_part.first_model.Country;
import jdbc_homework_fist_part.init.DBCreationFacade;
import jdbc_homework_fist_part.service.CityService;
import jdbc_homework_fist_part.service.CountryService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DBCreationFacade dbCreationFacade = new DBCreationFacade();
        //after first run -> make it false, to create database -> true
        dbCreationFacade.createAndInsertDb(false);
        CityWithCountryFetcher cityWithCountryFetcher = new CityWithCountryFetcher();
        try {
            List<City> cityList = cityWithCountryFetcher.fetchCityWithCountry();
            System.out.println(cityList);
            CityService cityService = new CityService();
            City city = cityService.getCityById(1);
            System.out.println(city);
            CountryService countryService = new CountryService();
            Country country = countryService.getCountryById(1);
            System.out.println(country);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
