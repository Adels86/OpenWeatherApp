package net.atos.weatherapplication.model;

import lombok.*;
import net.atos.weatherapplication.model.webClientModel.WeatherDao;
@Getter
@Builder

public class OpenWeather {
    private int all;
    private float temp;
    private WeatherDao description;
    private String icon;

}
