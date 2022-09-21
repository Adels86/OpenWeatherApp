package net.atos.weatherapplication.soap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import javax.xml.ws.Holder;


@Slf4j
@Endpoint
public class OpenWeatherEndpoint implements OpenWeatherPortType {
    private static final String NAMESPACE_URI = "http://atos.net/weather_soap";

    private final GetWeather getWeather;

    @Autowired
    public OpenWeatherEndpoint(GetWeather getWeather) {
        this.getWeather = getWeather;
    }

    @Override
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWeather")
    @ResponsePayload
    public void getWeather(@RequestPayload Holder<String> getWeather) {
        log.info("Incoming soap weather");


    }
}
