package net.atos.weatherapplication.controller;

import lombok.extern.slf4j.Slf4j;
import net.atos.weatherapplication.exception.UserOrderNotFoundException;
import net.atos.weatherapplication.model.OpenWeather;
import net.atos.weatherapplication.model.UserOrder;
import net.atos.weatherapplication.service.CityService;
import net.atos.weatherapplication.service.OrderService;
import net.atos.weatherapplication.weatherclient.WeatherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;


@Controller
@Slf4j
public class WeatherController {

    private UserOrder userOrder;
    @Autowired
    private CityService cityService;

    @Autowired
    WeatherClient weatherClient;

    @Autowired
    private OrderService orderService;

    @GetMapping(path = "/cities")
    public String citieList(ModelMap modelMap) {
        modelMap.addAttribute("emptyOrder", new UserOrder());
        return "index";
    }

    @PostMapping("/cities")
    public String handleNewOrder(@ModelAttribute UserOrder userOrderFromUser) {
        log.info("Received user: " + userOrderFromUser);

         this.userOrder = userOrderFromUser;
            return "redirect:/order";


    }

    @GetMapping(path = "/order")
    public String getOrders(ModelMap modelMap) {
        if(userOrder == null){
            throw new UserOrderNotFoundException(userOrder);}

        List<OpenWeather> openWeathers = new ArrayList<>();
        List<OpenWeather> orderedWeathers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            openWeathers.add(cityService.getWeatherFromApi(cityService.getById(i).getLat(), cityService.getById(i).getLon()));
        }

        if (!(userOrder.getBerlin() == null)) {
            orderedWeathers.add(openWeathers.get(7));
        }
        if (!(userOrder.getLondon() == null)) {
            orderedWeathers.add(openWeathers.get(2));
        }
        if (!(userOrder.getZocca() == null)) {
            orderedWeathers.add(openWeathers.get(0));
        }
        if (!(userOrder.getWarsaw() == null)) {
            orderedWeathers.add(openWeathers.get(1));
        }
        if (!(userOrder.getParis() == null)) {
            orderedWeathers.add(openWeathers.get(3));
        }
        if (!(userOrder.getRome() == null)) {
            orderedWeathers.add(openWeathers.get(4));
        }
        if (!(userOrder.getMadrid() == null)) {
            orderedWeathers.add(openWeathers.get(6));
        }
        if (!(userOrder.getTokio() == null)) {
            orderedWeathers.add(openWeathers.get(8));
        }
        if (!(userOrder.getSydney() == null)) {
            orderedWeathers.add(openWeathers.get(9));
        }
        if(orderedWeathers.isEmpty()){
            throw new UserOrderNotFoundException(userOrder);
        }

        modelMap.addAttribute("orderedWeathers", orderedWeathers);
        return "order";
    }

}


