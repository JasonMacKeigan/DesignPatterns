package patterns.state.impl;

import patterns.state.Weather;
import patterns.state.WeatherContext;

/**
 * Created by Jason MacKeigan on 2018-05-10 at 10:26 AM
 */
public class Wind implements Weather {

    @Override
    public void process(WeatherContext context) {
        System.out.println("It is windy...");
        context.setWeather(new Rain());
    }
}
