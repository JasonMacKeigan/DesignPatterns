package patterns.mvc;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by Jason MK on 2019-06-21 at 8:26 PM
 */
public class View {

    public void print(Model model) {
        System.out.println(ReflectionToStringBuilder.toString(model, ToStringStyle.JSON_STYLE));
    }
}
