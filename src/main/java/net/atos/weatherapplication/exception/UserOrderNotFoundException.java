package net.atos.weatherapplication.exception;

import net.atos.weatherapplication.model.UserOrder;

public class UserOrderNotFoundException extends RuntimeException {
    public UserOrderNotFoundException(UserOrder userOrder) {
        super("Could not find order from user: " + userOrder);
    }



}
