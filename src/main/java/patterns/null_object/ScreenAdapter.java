package patterns.null_object;

/**
 * Created by Jason MacKeigan on 2018-05-08 at 10:12 AM
 */
public class ScreenAdapter {

    private Screen screen;

    public ScreenAdapter(Screen screen) {
        if (screen == null) {
            screen = new EmptyScreen();
        }
        this.screen = screen;
    }

    public void setScreen(Screen screen) {
        if (screen == null) {
            screen = new EmptyScreen();
        }
        this.screen = screen;
    }

    public Screen getScreen() {
        return screen;
    }
}
