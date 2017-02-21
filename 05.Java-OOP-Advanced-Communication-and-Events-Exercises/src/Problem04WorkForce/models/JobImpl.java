package Problem04WorkForce.models;

import Problem04WorkForce.contracts.Employee;
import Problem04WorkForce.contracts.Job;
import Problem04WorkForce.contracts.JobDone;

/**
 * Created by contracts on 2/6/2017.
 */
public class JobImpl implements Job {
    private Employee employee;
    private String name;
    private int workingHours;
    private boolean isDone;

    public JobImpl(String name, int workingHours, Employee employee) {
        this.employee = employee;
        this.name = name;
        this.workingHours = workingHours;
        this.isDone = false;
    }

    public void update(){
        this.setWorkingHours(this.getWorkingHours() - this.employee.getWeeklyWorkingHours());
        if(this.getWorkingHours() <= 0){
            JobDone jobDoneImpl = new JobDoneImpl(this, this.getName());
            System.out.println(jobDoneImpl.getUpdateReport());
            this.setDone(true);
        }
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        return String.format("Job: %s Hours Remaining: %d", this.getName(), this.getWorkingHours());
    }

    private int getWorkingHours() {
        return workingHours;
    }

    private String getName() {
        return name;
    }

    private void setDone(boolean done) {
        isDone = done;
    }

    private void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
