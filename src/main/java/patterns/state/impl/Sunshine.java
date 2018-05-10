package patterns.state.impl;

import patterns.state.Weather;
import patterns.state.WeatherContext;

/**
 * Created by Jason MacKeigan on 2018-05-10 at 10:25 AM
 */
public class Sunshine implements Weather {

    @Override
    public void process(WeatherContext context) {
        System.out.println("The sun is shining...");
        context.setWeather(new Wind());
    }
}
