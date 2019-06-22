package patterns.object_pool;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jason MacKeigan on 2018-05-05 at 9:24 AM
 */
public class PooledObject implements AutoCloseable, Closeable {

    private String identifier;

    private long timeOfAvailability;

    private final long expirationTime;

    private final TimeUnit expirationTimeUnit;

    private PooledObjectState state = PooledObjectState.INSTANTIATED;

    public PooledObject(long expirationTime, TimeUnit expirationTimeUnit) {
        this.expirationTime = expirationTime;
        this.expirationTimeUnit = expirationTimeUnit;
    }

    private void reset() {
        identifier = null;
    }

    public void use() {
        if (state != PooledObjectState.IDLE && state != PooledObjectState.INSTANTIATED) {
            throw new IllegalStateException("Object is already in use.");
        }
        timeOfAvailability = System.nanoTime();
        state = PooledObjectState.IN_USE;
        reset();
    }

    public void idle() {
        state = PooledObjectState.IDLE;
    }

    public boolean isClosed() {
        return state == PooledObjectState.CLOSED;
    }

    public boolean isExpired() {
        return System.nanoTime() - timeOfAvailability >= expirationTimeUnit.toNanos(expirationTime);
    }

    @Override
    public void close() throws IOException {
        if (state == PooledObjectState.CLOSED) {
            return;
        }
        if (state != PooledObjectState.IN_USE) {
            throw new IllegalStateException("State must be use before it can be closed.");
        }
        state = PooledObjectState.CLOSED;
    }

    public void assertOpen() {
        if (state == PooledObjectState.CLOSED) {
            throw new PooledObjectClosedException();
        }
        if (isExpired()) {
            throw new PooledObjectExpiredException();
        }
    }

    public String getIdentifier() {
        assertOpen();
        return identifier;
    }

    public void setIdentifier(String identifier) {
        assertOpen();
        this.identifier = identifier;
    }
}
