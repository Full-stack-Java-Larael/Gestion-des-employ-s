package Services;

import entities.Role;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RoleServiceTest {
    private static long id;

    @Test
    @Order(1)
    void add() {
        Role role = new Role();
        role.setName("Role"+new Random().nextInt());

        Service service = new RoleService();
        assertInstanceOf(Role.class,service.add(role));
        id = role.getIdRole();
    }

    @Test
    @Order(2)
    void getAll() {
        Service service = new RoleService();
        assertInstanceOf(new ArrayList<Role>().getClass(),service.getAll());
    }

    @Test

    @Order(4)
    void findById() {
        Service service = new RoleService();
        assertInstanceOf(Role.class,service.findById(id));
    }

    @Test

    @Order(3)
    void update() {
        Role role = new Role();
        role.setIdRole(id);
        role.setName("new Role"+new Random().nextInt());

        Service service = new RoleService();
        assertTrue(service.update(role));
    }

    @Test

    @Order(5)
    void delete() {
        Service service = new RoleService();
        assertTrue(service.delete(id));
    }
}