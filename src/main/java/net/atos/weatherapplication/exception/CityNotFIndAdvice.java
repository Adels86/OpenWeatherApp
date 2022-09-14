package net.atos.weatherapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CityNotFIndAdvice {
    @ResponseBody
    @ExceptionHandler(CityNotFindException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String cityNotFindHandler(CityNotFindException e) {
        return e.getMessage();
    }
}
