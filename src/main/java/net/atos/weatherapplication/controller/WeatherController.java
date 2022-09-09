package net.atos.weatherapplication.controller;

import net.atos.weatherapplication.model.OpenWeather;
import net.atos.weatherapplication.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class WeatherController {
    @Autowired
    private CityService cityService;

    @GetMapping(path = "/cities")
    public String citieList(ModelMap modelMap, String txt) {
        modelMap.addAttribute("cityList", cityService.getCities());
        modelMap.addAttribute("txt", "anmother random text");
        return "index";
    }

    @GetMapping(path ="/weather")
    public OpenWeather getWeather(){
        return cityService.getWeatherFromApi();
    }

}
