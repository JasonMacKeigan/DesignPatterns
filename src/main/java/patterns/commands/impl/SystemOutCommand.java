package patterns.commands.impl;

import patterns.commands.Command;
import patterns.commands.receiver.impl.SystemOutReceiver;

/**
 * Created by Jason MacKeigan on 2018-05-11 at 1:36 AM
 */
public class SystemOutCommand implements Command {

    private final SystemOutReceiver receiver;

    public SystemOutCommand(SystemOutReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println(receiver.getOutput());
    }
}
