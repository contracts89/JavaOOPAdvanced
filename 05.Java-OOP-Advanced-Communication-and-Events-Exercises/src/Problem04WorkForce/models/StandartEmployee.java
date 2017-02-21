package Problem04WorkForce.models;

import Problem04WorkForce.contracts.Employee;

/**
 * Created by contracts on 2/6/2017.
 */
public class StandartEmployee implements Employee {
    private String name;
    private static final int WEEKLY_WORKING_HOURS = 40;

    public StandartEmployee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getWeeklyWorkingHours() {
        return WEEKLY_WORKING_HOURS;
    }
}
