package Services;

import DAO.DAO;
import DAO.EmployeeDao;
import entities.Employee;

import java.util.ArrayList;

public class EmployeeService implements Service<Employee>{
    private DAO dao = new EmployeeDao();
    @Override
    public boolean add(Employee employee) {
        return dao.add(employee);
    }

    @Override
    public ArrayList<Employee> getAll() {
        return null;
    }

    @Override
    public Employee findById(long id) {
        return null;
    }

    @Override
    public boolean update(Employee employee) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
