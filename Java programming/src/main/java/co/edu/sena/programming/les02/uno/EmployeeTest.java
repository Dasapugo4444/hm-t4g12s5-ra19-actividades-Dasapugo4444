package co.edu.sena.programming.les02.uno;

import co.edu.sena.programming.les02.uno.Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setId(101);
        employee.setName("Jane Smith");
        employee.setSsn("012-34-4569");
        employee.setSalary(120_345.27);

        Employee employee1=new Employee();
        employee1.setId(102);
        employee1.setName("Jane Smoth");
        employee1.setSsn("112-34-4569");
        employee1.setSalary(130_345.27);

        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSsn());
        System.out.println(employee.getSalary());
        System.out.println("------------");

        System.out.println(employee1.getId());
        System.out.println(employee1.getName());
        System.out.println(employee1.getSsn());
        System.out.println(employee1.getSalary());
        System.out.println("------------");

    }

}
