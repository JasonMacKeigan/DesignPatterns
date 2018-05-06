package patterns.adapter;

import org.junit.Test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Scanner;

/**
 * Created by Jason MacKeigan on 2018-05-06 at 1:48 PM
 */
public class AdapterTest {

    @Test
    public void assertGameIsReal() {
        GameAdapter implementation = new TwoDimensionalGame();

        BasicGameAdapter adapter = new BasicGameAdapter(implementation);

        assert adapter.getImplementationClass() == implementation.getClass();
    }

}
