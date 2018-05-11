package patterns.commands.receiver.impl;

import patterns.commands.receiver.Receiver;

/**
 * Created by Jason MacKeigan on 2018-05-11 at 1:40 AM
 */
public class SystemOutReceiver implements Receiver {

    private final String output;

    public SystemOutReceiver(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }
}
