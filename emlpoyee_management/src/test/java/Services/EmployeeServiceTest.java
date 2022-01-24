package Services;

import entities.Address;
import entities.Employee;
import entities.Role;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    @Test
    void add() {
        Role role = new Role();
        role.setIdRole((long) 201);
        Address address = new Address();
        address.setIdAddress((long)401);
        Employee employee = new Employee();
        employee.setFirstName("Abdelaziz");
        employee.setLastName("Bardich");
        employee.setEmail("abdelazizbardich@gmail.com");
        employee.setPassword("pass1234");
        employee.setRole(role);
        employee.setAddress(address);
        Service service = new EmployeeService();
        assertTrue(service.add(employee));
    }

    @Test
    void getAll() {
        Service service = new EmployeeService();
        assertInstanceOf(new ArrayList<Employee>().getClass(),service.getAll());
    }

    @Test
    void findById() {
        Service service = new EmployeeService();
        assertInstanceOf(Employee.class,service.findById((long)3));
    }

    @Test
    void update() {
        Role role = new Role();
        role.setIdRole((long) 201);
        Address address = new Address();
        address.setIdAddress((long)401);
        Employee employee = new Employee();
        employee.setIdUser((long)1);
        employee.setFirstName("new Abdelaziz emp");
        employee.setLastName("new Bardich emp");
        employee.setEmail("abdelazizbardich@gmail.com");
        employee.setPassword("pass1234");
        employee.setRole(role);
        employee.setAddress(address);
        Service service = new EmployeeService();
        assertTrue(service.update(employee));
    }

    @Test
    void delete() {
        Service service = new EmployeeService();
        assertTrue(service.delete((long)3));
    }
}