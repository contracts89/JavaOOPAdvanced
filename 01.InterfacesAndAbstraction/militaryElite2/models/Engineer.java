package militaryElite2.models;

import militaryElite2.contracts.IRepair;
import militaryElite2.contracts.IEngineer;

import java.util.Collection;

/**
 * Created by Radoslav on 2.8.2016 г..
 */
public class Engineer extends SpecialisedSoldier implements IEngineer {
    private Collection<IRepair> repairs;

    public Engineer(String id, String firstName, String lastName, double salary, String corps, Collection<IRepair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.setRepairs(repairs);
    }

    private void setRepairs(Collection<IRepair> repairs) {
        this.repairs = repairs;
    }

    @Override
    public Collection<IRepair> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).
                append(System.lineSeparator()).
                append("Repairs:");
        for (IRepair repair : repairs) {
            builder.append(System.lineSeparator()).
                    append("  " + repair.toString());
        }

        return builder.toString();
    }
}
