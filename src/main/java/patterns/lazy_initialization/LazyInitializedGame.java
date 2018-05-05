package patterns.lazy_initialization;

/**
 * Created by Jason MacKeigan on 2018-05-05 at 8:20 AM
 *
 * Implementation of the lazy initialization pattern in combination with the singleton pattern.
 */
public class LazyInitializedGame {

    /**
     * The single instance of the game that has not been initialized and is not declared final.
     */
    private static LazyInitializedGame singleton;

    /**
     * Private constructor to ensure no creation outside of this class.
     */
    private LazyInitializedGame() {

    }

    /**
     * Lazily initializes the {@link #singleton} object to 'save' resources.
     *
     * @return the single, lazily initialized, instance of the game.
     */
    public static LazyInitializedGame getSingleton() {
        if (singleton == null) {
            return new LazyInitializedGame();
        }

        return singleton;
    }
}
