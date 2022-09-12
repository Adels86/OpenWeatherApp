package net.atos.weatherapplication.model;

import lombok.Getter;
import net.atos.weatherapplication.model.webClientModel.Clouds;
import net.atos.weatherapplication.model.webClientModel.Main;
import net.atos.weatherapplication.model.webClientModel.Weather;

import java.util.List;

@Getter
public class WeatherFromClient {
    private Clouds clouds;
    private Main main;
    private List<Weather> weather;
    private String name;

}
