package net.atos.weatherapplication.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.atos.weatherapplication.model.Entity.City;
import net.atos.weatherapplication.model.OpenWeather;
import net.atos.weatherapplication.repository.CityRepository;
import net.atos.weatherapplication.service.CityService;
import net.atos.weatherapplication.weatherclient.WeatherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private WeatherClient weatherClient;




    @Override
    public List<City> getCities() {
        return cityRepository.findAll();
    }

    @Override
    public OpenWeather getWeatherFromApi() {
        return weatherClient.getWeatherForCoordinates("52.2298","21.0118");
    }
}
