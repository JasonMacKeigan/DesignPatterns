package patterns.observer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Jason MacKeigan on 2018-05-14 at 10:22 AM
 */
public class Browser {

    private String searchFieldText = "";

    private final Collection<SearchFieldListener> searchFieldListeners = new ArrayList<>();

    public void addSearchFieldListener(SearchFieldListener searchField) {
        searchFieldListeners.add(searchField);
    }

    public void removeSearchFieldListener(SearchFieldListener searchField) {
        searchFieldListeners.remove(searchField);
    }

    public void setSearchFieldText(String searchFieldText) {
        if (searchFieldText == null) {
            throw new IllegalArgumentException("Text for search field cannot be null.");
        }
        this.searchFieldText = searchFieldText;
        notifySearchFieldListeners();
    }

    private void notifySearchFieldListeners() {
        for (SearchFieldListener listener : searchFieldListeners) {
            listener.update(this.searchFieldText);
        }
    }

}
