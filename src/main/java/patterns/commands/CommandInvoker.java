package patterns.commands;

/**
 * Created by Jason MacKeigan on 2018-05-11 at 1:50 AM
 */
public class CommandInvoker {

    public void invoke(Command command) {
        command.execute();
    }

}
