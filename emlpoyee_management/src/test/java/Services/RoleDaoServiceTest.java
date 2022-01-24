package Services;

import entities.Role;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RoleDaoServiceTest {
    private static Service service = new RoleService();

    @Test
    void add() {
        Role role = new Role();
        role.setName("Role"+new Random().nextInt());
        assertTrue(service.add(role));
    }

    @Test
    void getAll() {
        assertInstanceOf(new ArrayList<Role>().getClass(),service.getAll());
    }

    @Test
    void findById() {
        assertInstanceOf(Role.class,service.findById((long)51));
    }

    @Test
    void update() {
        Role role = new Role();
        role.setIdRole((long)51);
        role.setName("new Role"+new Random().nextInt());
        assertTrue(service.update(role));
    }

    @Test
    void delete() {
        assertTrue(service.delete((long) 51));
    }
}