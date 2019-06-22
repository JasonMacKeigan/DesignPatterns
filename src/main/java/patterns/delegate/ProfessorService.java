package patterns.delegate;

/**
 * Created by Jason MK on 2019-06-21 at 9:17 PM
 */
public class ProfessorService implements EducatorService {

    @Override
    public void educate() {
        System.out.println("Educate as a Professor.");
    }
}
