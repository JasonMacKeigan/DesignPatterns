package patterns.factory_method;

/**
 * Created by Jason MacKeigan on 2018-05-06 at 2:00 PM
 */
public class Circle implements Shape {

    @Override
    public ShapeRenderer getRenderer() {
        return new CircleRenderer();
    }

}
