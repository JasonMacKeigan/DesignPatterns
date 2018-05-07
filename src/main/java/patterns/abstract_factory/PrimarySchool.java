package patterns.abstract_factory;

/**
 * Created by Jason MacKeigan on 2018-05-07 at 8:57 AM
 */
public class PrimarySchool implements SchoolFactory {

    @Override
    public Teacher assignTeacher() {
        return new PrimarySchoolTeacher();
    }

   public class PrimarySchoolTeacher implements Teacher {

        @Override
        public void teach() {
            System.out.println("Teaching at primary level.");
        }

    }
}
