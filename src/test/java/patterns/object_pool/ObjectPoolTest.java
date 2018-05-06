package patterns.object_pool;

import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jason MacKeigan on 2018-05-05 at 10:04 AM
 */
public class ObjectPoolTest {

    @Test
    public void assertAllRequirements() {
        try (PooledObjectPool pool = new PooledObjectPool(100, 5, TimeUnit.SECONDS)) {
            for (int amount = 0; amount < 10; amount++) {
                try (PooledObject object = pool.next()) {
                    int identifier = object.hashCode(); // already cleaned up by the pool

                    System.out.println("Identifier ("+amount+"): " + identifier);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
