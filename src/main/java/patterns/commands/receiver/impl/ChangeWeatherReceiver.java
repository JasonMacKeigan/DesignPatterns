package patterns.commands.receiver.impl;

import patterns.commands.receiver.Receiver;
import patterns.state.Weather;

/**
 * Created by Jason MacKeigan on 2018-05-11 at 1:43 AM
 */
public class ChangeWeatherReceiver implements Receiver {

    private final Weather weather;

    public ChangeWeatherReceiver(Weather weather) {
        this.weather = weather;
    }

    public Weather getWeather() {
        return weather;
    }
}
