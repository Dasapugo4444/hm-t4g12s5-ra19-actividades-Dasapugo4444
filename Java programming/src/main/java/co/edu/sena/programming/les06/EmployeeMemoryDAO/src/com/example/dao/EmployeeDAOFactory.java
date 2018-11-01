package co.edu.sena.programming.les06.EmployeeMemoryDAO.src.com.example.dao;

public class EmployeeDAOFactory {

    public EmployeeDAO createEmployeeDAO(){
        return new EmployeeDAOMemoryImpl();
    }

}
