package net.atos.weatherapplication.service;

import net.atos.weatherapplication.model.Entity.City;
import net.atos.weatherapplication.model.OpenWeather;
import net.atos.weatherapplication.model.UserOrder;

import java.util.List;

public interface OrderService {
    public UserOrder getOrder();
    public void save(UserOrder userOrder);

    public OpenWeather getByName();
    public City city(int id);

}
