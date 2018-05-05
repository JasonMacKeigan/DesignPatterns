package patterns.lazy_initialization;

import org.junit.Test;

/**
 * Created by Jason MacKeigan on 2018-05-05 at 8:25 AM
 */
public class LazyInitializationTest {

    @Test
    public void assertIsInitialized() {
        assert LazyInitializedGame.getSingleton() != null;
    }
}
