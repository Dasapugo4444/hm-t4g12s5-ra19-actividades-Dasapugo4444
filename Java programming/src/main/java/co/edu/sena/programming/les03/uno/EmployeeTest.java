package co.edu.sena.programming.les03.uno;

public class EmployeeTest {

    public static void main(String[] args) {

        Engineer engineer=new Engineer
                (101,"Jane Smith","012-345-678",120_345.27);

        Manager manager=new Manager
                (207,"Barbara Johnson","054-12-2367",109_501.36);
        manager.setDeptName("Us Marketing");

        Admin admin=new Admin(304,"Bill Monroe","108-23-6509",75_002.34);

        Director director=new Director(12,"Susan Wheeler","099-45-2340",75_002.34);
        director.setDeptName("Golbal Marketing");
        director.setBudget(1_000_000.00);
    }

    public static void printEmployee(Employee emp){
        System.out.println("----------");
        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());
        System.out.println(emp.getSsn());
        System.out.println(emp.getSalary());

    }

}
