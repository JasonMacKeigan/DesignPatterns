package patterns.state.impl;

import patterns.state.Weather;
import patterns.state.WeatherContext;

/**
 * Created by Jason MacKeigan on 2018-05-10 at 10:25 AM
 */
public class Rain implements Weather {

    @Override
    public void process(WeatherContext context) {
        System.out.println("It is raining...");
        context.setWeather(new Sunshine());
    }

}
