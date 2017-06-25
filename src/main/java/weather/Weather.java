
package weather;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Weather {

    private Coord coord;
    private Sys sys;
    private List<Weather_> weather = null;
    private Main main;
    private Wind wind;
    private Rain rain;
    private Clouds clouds;
    private Integer dt;
    private Integer id;
    private String name;
    private Integer cod;

    public Coord getCoord() {
        return coord;
    }
    public void setCoord(Coord coord) {
        this.coord = coord;
    }
    public Sys getSys() {
        return sys;
    }
    public void setSys(Sys sys) {
        this.sys = sys;
    }
    public List<Weather_> getWeather() {
        return weather;
    }
    public void setWeather(List<Weather_> weather) {
        this.weather = weather;
    }
    public Main getMain() {
        return main;
    }
    public void setMain(Main main) {
        this.main = main;
    }
    public Wind getWind() {
        return wind;
    }
    public void setWind(Wind wind) {
        this.wind = wind;
    }
    public Rain getRain() {
        return rain;
    }
    public void setRain(Rain rain) {
        this.rain = rain;
    }
    public Clouds getClouds() {
        return clouds;
    }
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }
    public Integer getDt() {
        return dt;
    }
    public void setDt(Integer dt) {
        this.dt = dt;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCod() {
        return cod;
    }
    public void setCod(Integer cod) {
        this.cod = cod;
    }
}
