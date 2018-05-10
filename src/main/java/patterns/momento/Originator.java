package patterns.momento;

/**
 * Created by Jason MacKeigan on 2018-05-10 at 12:42 AM
 */
public class Originator {

    private String identifier;

    public Originator(String identifier) {
        this.identifier = identifier;
    }

    public Momento toMomento() {
        return new Momento(identifier);
    }

    public void restore(Momento momento) {
        this.identifier = momento.getIdentifier();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "identifier='" + identifier + '\'' +
                '}';
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
