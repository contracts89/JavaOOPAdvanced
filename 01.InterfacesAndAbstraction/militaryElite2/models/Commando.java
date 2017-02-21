package militaryElite2.models;

import militaryElite2.contracts.ICommando;
import militaryElite2.contracts.IMission;

import java.util.Collection;

/**
 * Created by Radoslav on 2.8.2016 г..
 */
public class Commando extends SpecialisedSoldier implements ICommando {
    private Collection<IMission> missions;

    public Commando(String id, String firstName, String lastName, double salary, String corps, Collection<IMission> missions) {
        super(id, firstName, lastName, salary, corps);
        this.setMissions(missions);
    }

    private void setMissions(Collection<IMission> missions) {
        this.missions = missions;
    }

    @Override
    public Collection<IMission> getMissions() {
        return this.missions;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).
                append(System.lineSeparator()).
                append("Missions:");
        for (IMission mission : missions) {
            builder.append(System.lineSeparator()).
                    append("  " + mission.toString());
        }

        return builder.toString();
    }
}
