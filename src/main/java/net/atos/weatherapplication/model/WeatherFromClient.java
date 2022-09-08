package net.atos.weatherapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.atos.weatherapplication.model.webClientModel.Clouds;
import net.atos.weatherapplication.model.webClientModel.Main;
import net.atos.weatherapplication.model.webClientModel.WeatherDao;

@Getter
public class WeatherFromClient {
    private Clouds clouds;
    private Main main;
    private WeatherDao weatherDao;
}
