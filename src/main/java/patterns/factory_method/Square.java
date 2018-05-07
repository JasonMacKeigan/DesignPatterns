package patterns.factory_method;

/**
 * Created by Jason MacKeigan on 2018-05-06 at 2:02 PM
 */
public class Square implements Shape {

    @Override
    public ShapeRenderer getRenderer() {
        return new SquareRenderer();
    }

}
