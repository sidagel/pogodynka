
package weather;

import java.util.HashMap;
import java.util.Map;

public class Sys {

    private String country;
    private Integer sunrise;
    private Integer sunset;

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Integer getSunrise() {
        return sunrise;
    }
    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }
    public Integer getSunset() {
        return sunset;
    }
    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }
}
