package Problem04WorkForce.models;

import Problem04WorkForce.contracts.Employee;

/**
 * Created by contracts on 2/6/2017.
 */
public class PartTimeEmployee implements Employee {
    private String name;
    private static final int WEEKLY_WORKING_HOURS = 20;

    public PartTimeEmployee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeeklyWorkingHours() {
        return WEEKLY_WORKING_HOURS;
    }
}
