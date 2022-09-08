package net.atos.weatherapplication.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.atos.weatherapplication.model.OpenWeather;
import net.atos.weatherapplication.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public OpenWeather getWeather(){
        return weatherService.getWeather();
    }

}
