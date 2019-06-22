package patterns.delegate;

import java.util.Map;

/**
 * Created by Jason MK on 2019-06-21 at 9:18 PM
 */
public class EducatorLookup {

    private final Map<EducatorType, EducatorService> educators;

    public EducatorLookup(Map<EducatorType, EducatorService> educators) {
        this.educators = educators;
    }

    public EducatorService get(EducatorType type) {
        EducatorService service = educators.get(type);

        if (service == null) {
            throw new IllegalArgumentException("Cannot find service for type: " + type);
        }
        return service;
    }
}
