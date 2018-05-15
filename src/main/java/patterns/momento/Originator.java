package patterns.momento;

/**
 * Created by Jason MacKeigan on 2018-05-10 at 12:42 AM
 */
public class Originator {

    private Caretaker caretaker = new Caretaker();

    private String identifier;

    public Originator(String identifier) {
        this.identifier = identifier;

        save();
    }

    private void save() {
        caretaker.add(new Momento(identifier));
    }

    public void restoreToLast() {
        restore(caretaker.size() - 1);
    }

    public void restoreToFirst() {
        restore(0);
    }

    public void restore(int index) {
        Momento momento = caretaker.getOrNull(index);

        if (momento == null) {
            throw new IllegalArgumentException("Cannot restore momento from index.");
        }
        this.identifier = momento.getIdentifier();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;

        save();
    }

    @Override
    public String toString() {
        return "Originator{" + "identifier='" + identifier + '\'' + '}';
    }
}
