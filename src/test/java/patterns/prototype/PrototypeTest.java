package patterns.prototype;

import org.junit.Test;

/**
 * Created by Jason MacKeigan on 2018-05-04 at 8:50 AM
 */
public class PrototypeTest {

    @Test
    public void assertClone() {
        Sheep sheep = new HairlessSheep();

        try {
            Sheep firstClone = sheep.clone();

            Sheep secondClone = sheep.clone();


            assert  sheep != firstClone && sheep != secondClone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
