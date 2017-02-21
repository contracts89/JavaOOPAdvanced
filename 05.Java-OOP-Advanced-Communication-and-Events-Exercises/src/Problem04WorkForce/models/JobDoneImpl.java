package Problem04WorkForce.models;

import Problem04WorkForce.contracts.JobDone;

import java.util.EventObject;

/**
 * Created by contracts on 2/6/2017.
 */
public class JobDoneImpl extends EventObject implements JobDone{
    private String name;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public JobDoneImpl(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getUpdateReport(){
        return String.format("Job %s done!", this.name);
    }
}
