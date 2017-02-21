package Problem04WorkForce;

import Problem04WorkForce.contracts.Employee;
import Problem04WorkForce.contracts.Job;
import Problem04WorkForce.models.JobImpl;
import Problem04WorkForce.models.PartTimeEmployee;
import Problem04WorkForce.models.StandartEmployee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by contracts on 2/6/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Employee employee = null;
        Map<String, Employee> employees = new HashMap<>();
        List<Job> jobs = new ArrayList<>();
        String[] input = br.readLine().split(" ");

        while(true){
            if(input[0].equalsIgnoreCase("end")){
                break;
            }

            switch (input[0]){
                case "StandartEmployee":
                    employee = createEmplioyee(input[0], input[1]);
                    employees.put(employee.getName(), employee);
                    break;
                case "PartTimeEmployee":
                    employee = createEmplioyee(input[0], input[1]);
                    employees.put(employee.getName(), employee);
                    break;
                case "Job":
                    Job job = createJob(employees, input);
                    jobs.add(job);
                    break;
                case "Pass":
                    updateJobs(jobs);
                    jobs.removeIf(Job::isDone);
                    break;
                case "Status":
                    printStatus(jobs);
                    break;
            }

            input = br.readLine().split(" ");
        }
    }

    private static void printStatus(List<Job> jobs) {
        for (Job job : jobs) {
            System.out.println(job.toString());
        }
    }

    private static void updateJobs(List<Job> jobs) {
        for (Job job : jobs) {
            job.update();
        }
    }

    private static Job createJob(Map<String, Employee> employees, String[] input) {
        Employee employee;
        employee = employees.remove(input[3]);
        return new JobImpl(input[1], Integer.parseInt(input[2]), employee);
    }

    public static Employee createEmplioyee(String type, String name){
        if(type.equalsIgnoreCase( "StandartEmployee")) {
            return new StandartEmployee(name);
        }else {
            return new PartTimeEmployee(name);
        }
    }
}
