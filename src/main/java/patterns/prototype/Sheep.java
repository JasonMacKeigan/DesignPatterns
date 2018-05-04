package patterns.prototype;

/**
 * Created by Jason MacKeigan on 2018-05-04 at 8:46 AM
 */
public class Sheep implements Cloneable {

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }

}
