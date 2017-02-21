package militaryElite2.models;

import militaryElite2.contracts.ILeutenantGeneral;
import militaryElite2.contracts.IPrivate;

import java.util.Collection;

/**
 * Created by Radoslav on 2.8.2016 г..
 */
public class LeutenantGeneral extends Private implements ILeutenantGeneral {
    private Collection<IPrivate> privates;

    public LeutenantGeneral(String id, String firstName, String lastName, double salary, Collection<IPrivate> privates) {
        super(id, firstName, lastName, salary);
        this.setPrivates(privates);
    }

    private void setPrivates(Collection<IPrivate> privates) {
        this.privates = privates;
    }
    @Override
    public Collection<IPrivate> getPrivates() {
        return this.privates;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).
                append(System.lineSeparator()).
                append("Privates:");
        for (IPrivate aPrivate : privates) {
            builder.append(System.lineSeparator()).
                    append("  " + aPrivate.toString());
        }

        return builder.toString();
    }
}
