package net.atos.weatherapplication.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.atos.weatherapplication.model.Entity.City;
import net.atos.weatherapplication.model.OpenWeather;
import net.atos.weatherapplication.model.UserOrder;
import net.atos.weatherapplication.repository.CityRepository;
import net.atos.weatherapplication.repository.OrderRepository;
import net.atos.weatherapplication.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public UserOrder getOrder() {
        return orderRepository.findAll().stream().findFirst().get();
        }

    @Override
    public void save(UserOrder userOrder) {
        orderRepository.save(userOrder);
    }

    @Override
    public City city(int id) {
        return cityRepository.findById(id).get();
    }

    @Override
    public OpenWeather getByName() {
        return null;
    }
}
