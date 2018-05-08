package patterns.null_object;

import org.junit.Test;

/**
 * Created by Jason MacKeigan on 2018-05-08 at 10:14 AM
 */
public class NullObjectTest {

    @Test
    public void assertNonNullReference() {
        ScreenAdapter screenAdapter = new ScreenAdapter(null);

        assert screenAdapter.getScreen() != null;

        screenAdapter.setScreen(null);

        assert screenAdapter.getScreen() != null && screenAdapter.getScreen().getClass() == EmptyScreen.class;
    }

}
