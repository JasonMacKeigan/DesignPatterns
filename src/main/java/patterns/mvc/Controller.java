package patterns.mvc;

import javax.naming.ldap.Control;

/**
 * Created by Jason MK on 2019-06-21 at 8:27 PM
 */
public class Controller {

    private Model model;

    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public Controller update(Model model, View view) {
        this.model = model;
        this.view = view;

        return this;
    }

    public Controller request() {
        view.print(model);

        return this;
    }

}
