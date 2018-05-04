package patterns.prototype;

/**
 * Created by Jason MacKeigan on 2018-05-04 at 8:53 AM
 */
public class HairlessSheep extends Sheep {

    @Override
    protected HairlessSheep clone() throws CloneNotSupportedException {
        return (HairlessSheep) super.clone();
    }
}
