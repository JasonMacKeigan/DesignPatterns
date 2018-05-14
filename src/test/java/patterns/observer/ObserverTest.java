package patterns.observer;

import org.junit.Test;

/**
 * Created by Jason MacKeigan on 2018-05-14 at 10:46 AM
 */
public class ObserverTest {

    @Test
    public void assertObserverUpdated() {
        Browser googleChrome = new Browser();

        SearchFieldListener listener = new SearchFieldListener(text -> {
            System.out.println(String.format("Text was updated to %s", text));
        });

        googleChrome.addSearchFieldListener(listener);

        String link = "https://www.google.com/chrome";

        googleChrome.setSearchFieldText(link);

        assert listener.getText().equals(link);
    }
}
