package co.edu.sena.programming.les06.EmployeeMemoryDAO.src.com.example.dao;

import co.edu.sena.programming.les06.EmployeeMemoryDAO.src.com.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOMemoryImpl implements EmployeeDAO{

    private static Employee[] employeeArray=new Employee[10];

    @Override
    public void add(Employee emp) {

    }

    @Override
    public void update(Employee emp) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public Employee[] getAllEmployees() {
        List<Employee>emps=new ArrayList<>();
        for (Employee e:employeeArray){
            if (e!=null){
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
}
