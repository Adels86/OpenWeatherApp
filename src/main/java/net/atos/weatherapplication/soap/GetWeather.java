
package net.atos.weatherapplication.soap;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getWeather complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWeather">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getWeather" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWeather", propOrder = {
    "getWeather"
})
@Component
public class GetWeather {

    @XmlElement(required = true, nillable = true)
    protected String getWeather;

    /**
     * Gets the value of the getWeather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetWeather() {
        return getWeather;
    }

    /**
     * Sets the value of the getWeather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetWeather(String value) {
        this.getWeather = value;
    }

}
