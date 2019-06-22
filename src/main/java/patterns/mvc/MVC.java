package patterns.mvc;

import javax.naming.ldap.Control;

/**
 * Created by Jason MK on 2019-06-21 at 8:28 PM
 */
public class MVC {

    public static void main(String[] args) {
        View view = new View();

        Controller controller = new Controller(new Model(1), view).request();

        controller.update(new Model(2), view).request();

        controller.update(new Model(3), view).request();
    }

}
