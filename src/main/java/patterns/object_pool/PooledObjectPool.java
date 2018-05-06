package patterns.object_pool;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Created by Jason MacKeigan on 2018-05-05 at 9:26 AM
 */
public class PooledObjectPool implements AutoCloseable, Closeable {

    /**
     * The maximum number of pooled object instances that can exist at one time.
     */
    private final int capacity;

    /**
     * The maximum lifetime expectancy of any given pooled object.
     */
    private final long maximumLifetime;

    /**
     * The unit of time to measure the lifetime expectancy.
     */
    private final TimeUnit maximumLifetimeUnit;

    /**
     * A set of pooled objects that are use.
     */
    private final Set<PooledObject> available = new HashSet<>();

    /**
     * A set of pooled objects that are idle because they're being used.
     */
    private final Set<PooledObject> unavailable = new HashSet<>();

    /**
     * Determines if this pool is open or not.
     */
    private boolean closed;

    public PooledObjectPool(int capacity, long maximumLifetime, TimeUnit maximumLifetimeUnit) {
        this.capacity = capacity;
        this.maximumLifetime = maximumLifetime;
        this.maximumLifetimeUnit = maximumLifetimeUnit;
    }

    private void clean() {
        Set<PooledObject> expired = unavailable.stream().filter(object -> object.isExpired() || object.isClosed()).collect(Collectors.toSet());

        expired.forEach(PooledObject::idle);

        unavailable.removeAll(expired);
        available.addAll(expired);
    }

    public PooledObject next() {
        if (closed) {
            throw new PooledObjectPoolClosedException("Pool is closed, cannot retrieve anymore objects.");
        }

        if (!unavailable.isEmpty()) {
            clean();
        }

        if (available.isEmpty()) {
            if (unavailable.size() + available.size() >= capacity) {
                throw new PooledObjectPoolCapacityException(String.format("Pool of size %s has reached capacity.", capacity));
            }
            PooledObject next = new PooledObject(maximumLifetime, maximumLifetimeUnit);

            next.use();

            unavailable.add(next);

            return next;
        } else {
            PooledObject next = available.stream().findAny().orElseThrow(NullPointerException::new);

            next.use();

            unavailable.add(next);

            return next;
        }
    }

    public int getNumberOfUnavailable() {
        return unavailable.size();
    }

    public int getNumberOfAvailable() {
        return available.size();
    }

    @Override
    public void close() throws IOException {
        closed = true;
    }
}
