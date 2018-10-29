package co.edu.sena.programming.les02.dos;

import co.edu.sena.programming.les02.dos.example.Employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setName("Santiago");
        emp.setSalary(120.000);
        emp.setSsn("132456");

        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println(emp.getSsn());
    }

}
