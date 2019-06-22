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
        try (PooledObjectPool pool = new PooledObjectPool(5, 1, TimeUnit.SECONDS)) {
            for (int index = 0; index < 10; index++) {
                System.out.println(String.format("%s -> ava=%s, una=%s", index, pool.getNumberOfAvailable(), pool.getNumberOfUnavailable()));
                close(pool, index);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close(PooledObjectPool pool, int index) {
        try (PooledObject object = pool.next()) {
            Object identifier = object.hashCode(); // already cleaned up by the pool

            System.out.println("Identifier ("+index+"): " + identifier);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void keepOpen(PooledObjectPool pool, int index) {
        PooledObject object = pool.next();

        Object identifier = object.getIdentifier(); // already cleaned up by the pool

        System.out.println("Identifier ("+index+"): " + identifier);
    }
}
