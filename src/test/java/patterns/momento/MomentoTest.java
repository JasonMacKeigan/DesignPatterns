package patterns.momento;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Jason MacKeigan on 2018-05-10 at 12:53 AM
 */
public class MomentoTest {

    public static void main(String[] args) {
        Originator originator = new Originator("jason");

        Momento firstMomento = originator.toMomento();

        originator.setIdentifier("jason2");

        Momento secondMomento = originator.toMomento();

        assert originator.getIdentifier().equals(secondMomento.getIdentifier());

        originator.restore(firstMomento);

        assert originator.getIdentifier().equals(firstMomento.getIdentifier());

        System.out.println("first-momento: " + firstMomento.getIdentifier());
        System.out.println("second-momento: " + secondMomento.getIdentifier());
        System.out.println("originator: " + originator.getIdentifier());
    }
}
