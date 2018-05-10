package patterns.state;

/**
 * Created by Jason MacKeigan on 2018-05-10 at 10:23 AM
 */
public class WeatherContext {

    private Weather weather;

    public WeatherContext(Weather weather) {
        this.weather = weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Weather getWeather() {
        return weather;
    }

    public void process() {
        weather.process(this);
    }
}
