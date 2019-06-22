package patterns.business_delegate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import patterns.delegate.EducatorDelegate;
import patterns.delegate.EducatorType;
import patterns.delegate.School;

/**
 * Created by Jason MK on 2019-06-21 at 9:34 PM
 */
@RunWith(JUnit4.class)
public class BusinessDelegateTest {

    @Test
    public void assertProfessor() {
        EducatorDelegate delegate = new EducatorDelegate();

        delegate.setEducator(EducatorType.TEACHER);

        School school = new School(delegate);

        school.educate();

        delegate.setEducator(EducatorType.PROFESSOR);

        school.educate();

        Assert.assertSame(delegate.getType(), EducatorType.PROFESSOR);
    }

}
