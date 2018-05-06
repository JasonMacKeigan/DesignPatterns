package patterns.multition;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jason MacKeigan on 2018-05-06 at 8:37 AM
 */
public class Multition {

    public enum Key {
        FIRST,

        SECOND
    }

    private static final Map<Key, Multition> singletons = new HashMap<>();

    private Multition() {

    }

    public static Multition get(Key key) {
        Multition multition = singletons.get(key);

        if (multition == null) {
            multition = new Multition();
            singletons.put(key, multition);
        }

        return multition;
    }

}
