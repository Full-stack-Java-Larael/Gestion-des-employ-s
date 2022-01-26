package Services;

import entities.Address;
import entities.Employee;
import entities.Role;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeServiceTest {
    private static long id;
    @Test
    @Order(1)
    void add() {
        Role role = new RoleService().getAll().get(0);
        Address address = new AddressService().getAll().get(0);
        Employee employee = new Employee();
        employee.setFirstName("Abdelaziz");
        employee.setLastName("Bardich");
        employee.setEmail("abdelazizbardich@gmail.com");
        employee.setPassword("pass1234");
        employee.setRole(role);
        employee.setAddress(address);
        Service service = new EmployeeService();
        assertInstanceOf(Employee.class,service.add(employee));
        id = employee.getIdUser();
    }

    @Test
    @Order(4)
    void getAll() {
        Service service = new EmployeeService();
        assertInstanceOf(new ArrayList<Employee>().getClass(),service.getAll());
    }

    @Test
    @Order(2)
    void findById() {
        Service service = new EmployeeService();
        assertInstanceOf(Employee.class,service.findById(id));
    }

    @Test
    @Order(3)
    void update() {
        Role role = new RoleService().getAll().get(0);
        Address address = new AddressService().getAll().get(0);
        Employee employee = new Employee();
        employee.setIdUser(id);
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
    @Order(5)
    void delete() {
        Service service = new EmployeeService();
        assertTrue(service.delete(id));
    }
}