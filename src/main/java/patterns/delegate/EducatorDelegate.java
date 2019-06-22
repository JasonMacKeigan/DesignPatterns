package patterns.delegate;

import org.apache.commons.lang3.Functions;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jason MK on 2019-06-21 at 9:24 PM
 */
public class EducatorDelegate {

    private EducatorService service;

    private EducatorType type;

    private EducatorLookup lookup = new EducatorLookup(Stream.of(EducatorType.values())
            .collect(Collectors.toMap(Function.identity(), type -> type.getServiceSupplier().get())));

    public void setEducator(EducatorType type) {
        this.type = type;
        this.service = lookup.get(type);
    }

    public void educate() {
        service.educate();
    }

    public EducatorType getType() {
        return type;
    }

}
