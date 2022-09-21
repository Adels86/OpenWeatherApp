package net.atos.weatherapplication.exception;

public class CityNotFoundException extends RuntimeException {


    public CityNotFoundException(int id) {
        super("Could not find city " + id);
    }
}
