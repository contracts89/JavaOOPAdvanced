package militaryElite2.models;

import militaryElite2.contracts.IPrivate;

/**
 * Created by Radoslav on 2.8.2016 г..
 */
public class Private extends Soldier implements IPrivate {
    private double salary;

    public Private(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
    @Override
    public String toString() {
        return String.format("%s Salary: %.2f", super.toString(), this.getSalary());
    }
}
