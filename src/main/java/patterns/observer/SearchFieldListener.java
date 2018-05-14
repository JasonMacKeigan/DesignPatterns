package patterns.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.function.Consumer;

/**
 * Created by Jason MacKeigan on 2018-05-14 at 10:22 AM
 */
public class SearchFieldListener {

    private String text = "";

    private Consumer<String> onUpdate;

    public SearchFieldListener(Consumer<String> onUpdate) {
        this.onUpdate = onUpdate;
    }

    public SearchFieldListener() {
        this.onUpdate = text -> { };
    }

    public void update(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null.");
        }
        System.out.printf("Observer updated text to %s\n", text);
        this.text = text;
        this.onUpdate.accept(text);
    }

    public String getText() {
        return text;
    }
}
