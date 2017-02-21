package Problem01EventImplementation;

import java.util.EventObject;

/**
 * Created by contracts on 1/24/2017.
 */
public class NameChange extends EventObject {
    private String changedName;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public NameChange(Object source, String changedName) {
        super(source);
        this.changedName = changedName;
    }

    public String getChangedName(){
        return this.changedName;
    }
}
