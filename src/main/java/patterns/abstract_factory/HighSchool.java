package patterns.abstract_factory;

/**
 * Created by Jason MacKeigan on 2018-05-07 at 8:58 AM
 */
public class HighSchool implements SchoolFactory {

    @Override
    public Teacher assignTeacher() {
        return new HighSchoolTeacher();
    }

    public class HighSchoolTeacher implements Teacher {
        @Override
        public void teach() {

        }
    }
}
