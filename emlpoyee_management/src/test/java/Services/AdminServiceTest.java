package Services;

import entities.Address;
import entities.Admin;
import entities.Role;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AdminServiceTest {

    @Test
    void add() {
        Role role = new Role();
        role.setIdRole((long)51);
        Address address = new Address();
        address.setIdAddress((long)151);
        Admin admin = new Admin();
        admin.setFirstName("Abdelaziz");
        admin.setLastName("Bardich");
        admin.setEmail("abdelazizbardich@gmail.com");
        admin.setPassword("pass1234");
        admin.setRole(role);
        admin.setAddress(address);
        Service service = new AdminService();
        assertTrue(service.add(admin));
    }

    @Test
    void getAll() {
        Service service = new AdminService();
        assertInstanceOf(new ArrayList<Admin>().getClass(),service.getAll());
    }

    @Test
    void findById() {
        Service service = new AdminService();
        assertInstanceOf(Admin.class,service.findById((long)1));
    }

    @Test
    void update() {
        Role role = new Role();
        role.setIdRole((long)201);
        Address address = new Address();
        address.setIdAddress((long)401);
        Admin admin = new Admin();
        admin.setIdUser((long)1);
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
    void delete() {
        Service service = new AdminService();
        assertTrue(service.delete((long)1));
    }
}