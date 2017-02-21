package Problem01EventImplementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by contracts on 1/24/2017.
 */
public class Dispatcher {

    private String name;
    private List<NameChangeListener> listeners;

    public Dispatcher() {
        this.name = name;
        this.listeners = new ArrayList<>();
    }

    private String getName() {
        return name;
    }

    public void addNameChangeListener(NameChangeListener listener){
        this.listeners.add(listener);
    }

    public void fireNameChangeEvent(String name) {
        NameChange event = new NameChange(this, name);
        for (NameChangeListener listener : listeners) {
            listener.handleChangedName(event);
        }

        removeNameChangeListener();
    }

    private void removeNameChangeListener() {
        this.listeners.remove(this);
    }
}
