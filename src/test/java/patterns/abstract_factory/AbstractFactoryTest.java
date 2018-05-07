package patterns.abstract_factory;

import org.junit.Test;

/**
 * Created by Jason MacKeigan on 2018-05-07 at 9:00 AM
 */
public class AbstractFactoryTest {

    @Test
    public void assertClassesMatch() {
        assert new HighSchool().assignTeacher().getClass() == HighSchool.HighSchoolTeacher.class;

        assert new MiddleSchool().assignTeacher().getClass() == MiddleSchool.MiddleSchoolTeacher.class;

        assert new PrimarySchool().assignTeacher().getClass() == PrimarySchool.PrimarySchoolTeacher.class;
    }
}
