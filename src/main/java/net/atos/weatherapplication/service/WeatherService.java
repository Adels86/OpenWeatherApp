package net.atos.weatherapplication.service;

import net.atos.weatherapplication.model.OpenWeather;

public interface WeatherService {
    OpenWeather getWeatherFromApi();
}
