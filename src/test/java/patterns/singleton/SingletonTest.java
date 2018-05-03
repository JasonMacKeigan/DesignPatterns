package patterns.singleton;

import org.junit.Test;

/**
 * Created by Jason MacKeigan on 2018-05-03 at 2:54 PM
 */
public class SingletonTest {

    @Test
    public void assertSingletonAvailable() {
        assert Singleton.getSingleton() != null;
    }

}
