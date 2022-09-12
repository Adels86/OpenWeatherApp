package net.atos.weatherapplication.service;

import net.atos.weatherapplication.model.Entity.City;
import net.atos.weatherapplication.model.OpenWeather;
import net.atos.weatherapplication.model.UserOrder;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityService {
    OpenWeather getWeatherFromApi(double lon, double lat);

//    public void update(City city);

    List<City> getCities();
    public City getById(int id);

}
