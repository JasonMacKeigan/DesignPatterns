package patterns.momento;

/**
 * Created by Jason MacKeigan on 2018-05-10 at 12:44 AM
 */
public class Momento {

    private final String identifier;

    public Momento(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "Momento{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
