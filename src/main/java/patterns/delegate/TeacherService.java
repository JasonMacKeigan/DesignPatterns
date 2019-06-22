package patterns.delegate;

/**
 * Created by Jason MK on 2019-06-21 at 9:16 PM
 */
public class TeacherService implements EducatorService {

    @Override
    public void educate() {
        System.out.println("Educate as a Teacher.");
    }

}
