package patterns.momento;

import org.junit.Test;

/**
 * Created by Jason MacKeigan on 2018-05-10 at 12:53 AM
 */
public class MomentoTest {

    @Test
    public void assertCaretakerRestore() {
        Originator originator = new Originator("jason");

        originator.setIdentifier("jason1");

        originator.setIdentifier("jason2");

        originator.setIdentifier("jason3");

        originator.restoreToLast();

        System.out.println(String.format("originator last = %s", originator));

        originator.restoreToFirst();

        System.out.println(String.format("originator first = %s", originator));

        originator.restoreToLast();

        assert originator.getIdentifier().equals("jason3");
    }
}
