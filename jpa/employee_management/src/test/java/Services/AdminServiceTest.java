package Services;

import entities.Address;
import entities.Admin;
import entities.Role;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AdminServiceTest {
    private static long id;
    @Test
    @Order(1)
    void add() {
        Role role = new RoleService().getAll().get(0);
        Address address = new AddressService().getAll().get(0);
        Admin admin = new Admin();
        admin.setFirstName("Abdelaziz");
        admin.setLastName("Bardich");
        admin.setEmail("abdelazizbardich@gmail.com");
        admin.setPassword("pass1234");
        admin.setRole(role);
        admin.setAddress(address);
        Service service = new AdminService();
        assertInstanceOf(Admin.class,service.add(admin));
        id = admin.getIdUser();
    }

    @Test
    @Order(2)
    void getAll() {
        Service service = new AdminService();
        assertInstanceOf(new ArrayList<Admin>().getClass(),service.getAll());
    }

    @Test
    @Order(3)
    void findById() {
        Service service = new AdminService();
        assertInstanceOf(Admin.class,service.findById(id));
    }

    @Test
    @Order(4)
    void update() {
        Role role = new RoleService().getAll().get(0);
        Address address = new AddressService().getAll().get(0);
        Admin admin = new Admin();
        admin.setIdUser(id);
        admin.setFirstName("new Abdelaziz");
        admin.setLastName("new Bardich");
        admin.setEmail("abdelazizbardich@gmail.com");
        admin.setPassword("pass1234");
        admin.setRole(role);
        admin.setAddress(address);
        Service service = new AdminService();
        assertTrue(service.update(admin));
    }

    @Test
    @Order(5)
    void delete() {
        Service service = new AdminService();
        assertTrue(service.delete(id));
    }
}