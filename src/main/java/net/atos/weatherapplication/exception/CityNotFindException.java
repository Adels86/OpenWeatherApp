package net.atos.weatherapplication.exception;

public class CityNotFindException extends RuntimeException {


    public CityNotFindException(int id) {
        super("Could not find city " + id);
    }
}
