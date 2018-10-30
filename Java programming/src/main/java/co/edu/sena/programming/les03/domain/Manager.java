package co.edu.sena.programming.les03.domain;

public class Manager extends Employee {

    private String deptName;
    private Employee[] staff=new Employee[20];
    private int employeeCount=0;

    public Manager(int empId, String name, String ssn, double salary, String deptName){
        super(empId, name, ssn, salary);
        this.deptName=deptName;
    }

    public String getDeptName(){
        return deptName;
    }
}
