package net.atos.weatherapplication.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.atos.weatherapplication.model.OpenWeather;
import net.atos.weatherapplication.service.WeatherService;
import net.atos.weatherapplication.weatherclient.WeatherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherClient weatherClient;

    @Override
    public OpenWeather getWeatherFromApi() {
        return weatherClient.getWeatherForCoordinates("52.2298","21.0118");
    }




}
