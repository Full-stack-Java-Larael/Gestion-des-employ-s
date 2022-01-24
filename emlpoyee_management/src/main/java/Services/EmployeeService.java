package Services;

import entities.Employee;

import java.util.ArrayList;

public class EmployeeService implements Service<Employee>{

    @Override
    public boolean add(Employee object) {
        return false;
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
    public boolean update(Employee object) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
