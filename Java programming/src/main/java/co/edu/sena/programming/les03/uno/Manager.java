package co.edu.sena.programming.les03.uno;

public class Manager extends Employee{

    private String deptName;

    public Manager(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
