package patterns.factory_method;

import org.junit.Test;

/**
 * Created by Jason MacKeigan on 2018-05-06 at 2:03 PM
 */
public class FactoryMethodTest {

    @Test
    public void assertClassNamesMatch() {
        Circle circle = new Circle();

        Square square = new Square();

        assert circle.getRenderer().getClass() == CircleRenderer.class;

        assert square.getRenderer().getClass() == SquareRenderer.class;
    }
}
