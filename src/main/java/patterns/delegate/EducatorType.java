package patterns.delegate;

import java.util.function.Supplier;

/**
 * Created by Jason MK on 2019-06-21 at 9:25 PM
 */
public enum EducatorType {
    TEACHER(TeacherService::new),

    PROFESSOR(ProfessorService::new);

    private final Supplier<EducatorService> serviceSupplier;

    EducatorType(Supplier<EducatorService> serviceSupplier) {
        this.serviceSupplier = serviceSupplier;
    }

    public Supplier<EducatorService> getServiceSupplier() {
        return serviceSupplier;
    }
}
