package co.edu.sena.programming.les03.domain;

public class Director extends Manager {

    private double budget;

    public Director(int empId, String name, String ssn, double salary, String deptName){
        super(empId,name,ssn,salary,deptName);
        this.budget=budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
