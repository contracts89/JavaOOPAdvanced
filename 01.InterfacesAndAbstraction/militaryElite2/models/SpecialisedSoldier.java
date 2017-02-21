package militaryElite2.models;

import militaryElite2.contracts.ISpecializedSoldier;

/**
 * Created by Radoslav on 2.8.2016 г..
 */
public abstract class SpecialisedSoldier extends Private implements ISpecializedSoldier {
    private String corps;

    public SpecialisedSoldier(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps) {
        if(!corps.equals("Airforces") && !corps.equals("Marines")){
            throw new IllegalArgumentException("Invalid corps!");
        }
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return String.format("%s\nCorps: %s", super.toString(), this.getCorps());
    }
}
