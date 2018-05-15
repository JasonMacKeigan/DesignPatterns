package patterns.momento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason MacKeigan on 2018-05-15 at 7:08 PM
 */
public class Caretaker {

    private final List<Momento> history = new ArrayList<>();

    public void add(Momento momento) {
        history.add(momento);
    }

    public void remove(Momento momento) {
        history.remove(momento);
    }

    public void clear(Momento momento) {
        history.clear();
    }

    private Momento getOr(int index, Momento momento) {
        if (index < 0 || index > history.size() - 1) {
            return momento;
        }
        Momento existing = history.get(index);

        if (existing == null) {
            return momento;
        }

        return existing;
    }

    public int size() {
        return history.size();
    }

    public Momento getOrNull(int index) {
        return getOr(index, null);
    }

    public Momento getFirstOr(Momento momento) {
        return getOr(0, momento);
    }

    public Momento getFirstOrNull() {
        return getFirstOr(null);
    }

    public Momento getLastOr(Momento momento) {
        return getOr(history.size() - 1, momento);
    }

    public Momento getLastOrNull() {
        return getLastOr(null);
    }

}
