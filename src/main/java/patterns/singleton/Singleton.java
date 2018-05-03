package patterns.singleton;

/**
 * <p>
 *      Reference: <a href="https://en.wikipedia.org/wiki/Singleton_pattern">Singleton Pattern.</a>
 * </p>
 *
 * Created by Jason MacKeigan on 2018-05-03 at 2:46 PM
 */
public class Singleton {

    /**
     * A single instance of this class which is to be used with the global getter
     * to complete the singleton pattern contract.
     */
    private static final Singleton singleton = new Singleton();

    /**
     * A private constructor to ensure that this class cannot be instanced
     * outside of this class.
     */
    private Singleton() {

    }

    void a() {
        singleton.a();
    }

    /**
     * Provides a global access point to reference the single instance we created
     * in this class.
     *
     * @return the single instance of this class.
     */
    public static Singleton getSingleton() {
        return singleton;
    }
}
