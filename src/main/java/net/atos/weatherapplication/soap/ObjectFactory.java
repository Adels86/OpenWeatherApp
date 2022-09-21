
package net.atos.weatherapplication.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.atos.weatherapplication.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetWeather_QNAME = new QName("http://atos.net/weather_soap", "getWeather");
    private final static QName _GetResponse_QNAME = new QName("http://atos.net/weather_soap", "getResponse");
    private final static QName _OpenWeatherIcon_QNAME = new QName("", "icon");
    private final static QName _OpenWeatherName_QNAME = new QName("", "name");
    private final static QName _OpenWeatherDescription_QNAME = new QName("", "description");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.atos.weatherapplication.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link GetWeather }
     * 
     */
    public GetWeather createGetWeather() {
        return new GetWeather();
    }

    /**
     * Create an instance of {@link OpenWeather }
     * 
     */
    public OpenWeather createOpenWeather() {
        return new OpenWeather();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atos.net/weather_soap", name = "getWeather")
    public JAXBElement<GetWeather> createGetWeather(GetWeather value) {
        return new JAXBElement<GetWeather>(_GetWeather_QNAME, GetWeather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atos.net/weather_soap", name = "getResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<GetResponse>(_GetResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "icon", scope = OpenWeather.class)
    public JAXBElement<String> createOpenWeatherIcon(String value) {
        return new JAXBElement<String>(_OpenWeatherIcon_QNAME, String.class, OpenWeather.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = OpenWeather.class)
    public JAXBElement<String> createOpenWeatherName(String value) {
        return new JAXBElement<String>(_OpenWeatherName_QNAME, String.class, OpenWeather.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = OpenWeather.class)
    public JAXBElement<String> createOpenWeatherDescription(String value) {
        return new JAXBElement<String>(_OpenWeatherDescription_QNAME, String.class, OpenWeather.class, value);
    }

}
