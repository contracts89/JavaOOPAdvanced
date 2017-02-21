package Problem01EventImplementation;

/**
 * Created by contracts on 1/24/2017.
 */
public class Handler implements NameChangeListener{

    @Override
    public void handleChangedName(NameChange event) {
        System.out.println("Dispatcher's name changed to " + event.getChangedName() + ".");
    }
}
