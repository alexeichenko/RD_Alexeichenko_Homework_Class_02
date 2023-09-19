package jdbc_homework_fist_part.service;

import jdbc_homework_fist_part.crud.CityManager;
import jdbc_homework_fist_part.first_model.City;

import java.sql.SQLException;

public class CityService {
    private CityManager cityManager;
    public CityService() {
        this.cityManager = new CityManager();
    }
    public void createCity(City city) throws SQLException {
        cityManager.insertCit(city);
    }
    public City getCityById(int id) throws SQLException {
        return cityManager.findByCityId(id);
    }
    public void updateCity(City city) throws SQLException {
        cityManager.updateCity(city);
    }
    public void deleteCity(int id) throws SQLException {
        cityManager.deleteCity(id);
    }
}
