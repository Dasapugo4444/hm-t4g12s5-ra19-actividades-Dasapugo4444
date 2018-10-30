package co.edu.sena.programming.les03;

import co.edu.sena.programming.les03.domain.*;

import java.text.NumberFormat;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee eng = new Employee (101,"Jane Smith","012-34-5678",120_345.27);

        Employee man = new Manager(207,"Barbara Johnoson","054-12-2367",109_501.36,"US Marketing");
        man.raiseSalary(500_000);

        Employee dir = new Director(12,"Susan Wheeler","099-45-1240",120_567.36,"Global Marketing");
        ((Director) dir).setBudget(1_000_000.00);
        dir.raiseSalary(120_000);


        printEmployee(eng);
        printEmployee(man);
        printEmployee(dir);
    }
    public static void printEmployee(Employee emp){
        System.out.println ();
        System.out.println ("Information: ");
        System.out.println ("Employee id:         " + emp.getEmpId());
        System.out.println ("Employee name:       " + emp.getName());
        System.out.println ("Employee Soc Sec #:  " + emp.getSsn());
        System.out.println ("Employee salary:     " + NumberFormat.getCurrencyInstance().format((double)emp.getSalary()));
        if (emp instanceof Director){
            System.out.println("Employee budget:     "+((Director) emp).getBudget());
        }
    }

}