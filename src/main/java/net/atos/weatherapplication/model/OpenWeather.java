package net.atos.weatherapplication.model;

import lombok.*;
import net.atos.weatherapplication.model.webClientModel.Weather;

import java.util.List;

@Getter
@Builder
public class OpenWeather {
    private int all;
    private float temp;
    private String description;
    private String icon;
    private String name;
}
