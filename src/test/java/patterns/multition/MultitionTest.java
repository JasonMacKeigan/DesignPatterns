package patterns.multition;

import org.junit.Test;

/**
 * Created by Jason MacKeigan on 2018-05-06 at 8:40 AM
 */
public class MultitionTest {

    @Test
    public void assertNonNull() {
        Multition first = Multition.get(Multition.Key.FIRST);

        Multition second = Multition.get(Multition.Key.SECOND);

        assert first != null && second != null && first != second;
    }
}
