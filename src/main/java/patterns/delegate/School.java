package patterns.delegate;

/**
 * Created by Jason MK on 2019-06-21 at 9:32 PM
 */
public class School {

    private final EducatorDelegate educator;

    public School(EducatorDelegate educator) {
        this.educator = educator;
    }

    public void educate() {
        educator.educate();
    }

}
