package patterns.object_pool;

/**
 * Created by Jason MacKeigan on 2018-05-05 at 10:42 AM
 */
public enum PooledObjectState {
    INSTANTIATED,

    IN_USE,

    IDLE,

    CLOSED
}
