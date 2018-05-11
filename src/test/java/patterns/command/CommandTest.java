package patterns.command;

import org.junit.Test;
import patterns.commands.Command;
import patterns.commands.CommandInvoker;
import patterns.commands.impl.ChangeWeatherCommand;
import patterns.commands.impl.SystemOutCommand;
import patterns.commands.receiver.impl.ChangeWeatherReceiver;
import patterns.commands.receiver.impl.SystemOutReceiver;
import patterns.state.WeatherContext;
import patterns.state.impl.Rain;
import patterns.state.impl.Sunshine;
import patterns.state.impl.Wind;

/**
 * Created by Jason MacKeigan on 2018-05-11 at 1:38 AM
 */
public class CommandTest {

    @Test
    public void assertCommand() {
        CommandInvoker invoker = new CommandInvoker();

        WeatherContext context = new WeatherContext(new Rain());

        ChangeWeatherCommand first = new ChangeWeatherCommand(context, new ChangeWeatherReceiver(new Sunshine()));

        ChangeWeatherCommand second = new ChangeWeatherCommand(context, new ChangeWeatherReceiver(new Wind()));

        ChangeWeatherCommand third = new ChangeWeatherCommand(context, new ChangeWeatherReceiver(new Rain()));

        invoker.invoke(first);

        assert first.getContext().getWeather().getClass() == Sunshine.class;

        invoker.invoke(second);

        assert second.getContext().getWeather().getClass() == Wind.class;

        invoker.invoke(third);

        assert third.getContext().getWeather().getClass() == Rain.class;
    }

}
