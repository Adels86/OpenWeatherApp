package net.atos.weatherapplication.service;

import net.atos.weatherapplication.model.Entity.City;
import net.atos.weatherapplication.model.OpenWeather;

import java.util.List;

public interface CityService {
    OpenWeather getWeatherFromApi();

    public List<City> getCities();

}
