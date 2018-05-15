package patterns.momento;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Jason MacKeigan on 2018-05-10 at 12:53 AM
 */
public class MomentoTest {

    @Test
    public void assertCaretakerRestore() {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator("jason");

        caretaker.add(originator.toMomento());

        originator.setIdentifier("jason1");

        caretaker.add(originator.toMomento());

        originator.setIdentifier("jason2");

        caretaker.add(originator.toMomento());

        originator.setIdentifier("jason3");

        caretaker.add(originator.toMomento());

        originator.restore(caretaker.getLastOrNull());

        assert originator.getIdentifier().equals("jason3");
    }
}
