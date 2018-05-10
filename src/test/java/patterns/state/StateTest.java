package patterns.state;

import org.junit.Test;
import patterns.state.impl.Rain;

/**
 * Created by Jason MacKeigan on 2018-05-10 at 10:28 AM
 */
public class StateTest {

    @Test
    public void assertStateLoops() {
        WeatherContext context = new WeatherContext(new Rain());

        for (int hour = 0; hour < 3; hour++) {
            context.process();
        }

        assert context.getWeather().getClass() == Rain.class;
    }
}
