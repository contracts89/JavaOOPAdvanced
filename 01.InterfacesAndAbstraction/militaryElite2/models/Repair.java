package militaryElite2.models;

import militaryElite2.contracts.IRepair;

/**
 * Created by Radoslav on 2.8.2016 г..
 */
public class Repair implements IRepair {
    private String partName;
    private int hoursWorrked;

    public Repair(String partName, int hoursWorrked) {
        this.setPartName(partName);
        this.setHoursWorrked(hoursWorrked);
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    private void setHoursWorrked(int hoursWorrked) {
        this.hoursWorrked = hoursWorrked;
    }

    @Override
    public String getPartName() {
        return this.partName;
    }

    @Override
    public int getHoursWorked() {
        return this.hoursWorrked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d", this.getPartName(), this.getHoursWorked());
    }
}
