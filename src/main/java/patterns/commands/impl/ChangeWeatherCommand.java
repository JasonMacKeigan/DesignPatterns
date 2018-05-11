package patterns.commands.impl;

import patterns.commands.Command;
import patterns.commands.receiver.impl.ChangeWeatherReceiver;
import patterns.state.WeatherContext;

/**
 * Created by Jason MacKeigan on 2018-05-11 at 1:43 AM
 */
public class ChangeWeatherCommand implements Command {

    private final WeatherContext context;

    private final ChangeWeatherReceiver receiver;

    public ChangeWeatherCommand(WeatherContext context, ChangeWeatherReceiver receiver) {
        this.context = context;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        context.setWeather(receiver.getWeather());
    }

    public WeatherContext getContext() {
        return context;
    }

    public ChangeWeatherReceiver getReceiver() {
        return receiver;
    }
}
