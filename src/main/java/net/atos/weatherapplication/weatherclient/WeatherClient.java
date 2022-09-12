package net.atos.weatherapplication.weatherclient;

import lombok.extern.slf4j.Slf4j;
import net.atos.weatherapplication.model.OpenWeather;
import net.atos.weatherapplication.model.WeatherFromClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class WeatherClient {

    private static final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/";
    private static final String API_KEY = "0c82e654e101ff1ac3e346c6a27d1ea1";
    private RestTemplate restTemplate = new RestTemplate();


    public OpenWeather getWeatherForCoordinates(double lat, double lon) {
        WeatherFromClient weatherFromeClient = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={apiKey}&units=metric&lang=pl",
                WeatherFromClient.class, lat, lon, API_KEY);

        return OpenWeather.builder()
                .all(weatherFromeClient.getClouds().getAll())
                .temp(weatherFromeClient.getMain().getTemp())
                .description(weatherFromeClient.getWeather().get(0).getDescription())
                .icon(weatherFromeClient.getWeather().get(0).getIcon())
                .name(weatherFromeClient.getName())
                .build();
    }
}
