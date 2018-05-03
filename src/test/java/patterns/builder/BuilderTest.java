package patterns.builder;

import org.junit.Test;

/**
 * Created by Jason MacKeigan on 2018-05-03 at 3:11 PM
 */
public class BuilderTest {

    @Test
    public void assertBuilder() {
        Game game = new Game.Builder("Foo").setWidth(0).setHeight(1).build();

        assert game != null && game.getWidth() == 0 && game.getHeight() == 1;
    }

}
