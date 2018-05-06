package patterns.adapter;

/**
 * Created by Jason MacKeigan on 2018-05-06 at 1:46 PM
 */
public class BasicGameAdapter implements GameAdapter {

    private final GameAdapter adapter;

    public BasicGameAdapter(GameAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void start() {
        adapter.start();
    }

    @Override
    public void render() {
        adapter.render();
    }

    @Override
    public void end() {
        adapter.end();
    }

    public Class<? extends GameAdapter> getImplementationClass() {
        return adapter.getClass();
    }
}
