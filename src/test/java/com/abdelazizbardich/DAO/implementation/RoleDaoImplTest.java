package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.entities.Role;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Order(2)
class RoleDaoImplTest {
    private static long id;

    @Test
    @Order(1)
    void add() {
        Role role = new Role();
        role.setName("admin");
        Role newRole = new RoleDaoImpl().add(role);
        assertInstanceOf(Role.class,newRole);
        id = newRole.getId_role();
    }

    @Test
    @Order(2)
    void find() {
        assertInstanceOf(Role.class,new RoleDaoImpl().find(id));
    }

    @Test
    @Order(3)
    void getAll() {
        assertInstanceOf(new ArrayList<Role>().getClass(),new RoleDaoImpl().getAll());
    }

    @Test
    @Order(4)
    void update() {
        Role role = new Role();
        role.setId_role(id);
        role.setName("admin");
        assertInstanceOf(Role.class,new RoleDaoImpl().update(role));
    }

    @Test
    @Order(5)
    void delete() {
//        assertTrue(new RoleDaoImpl().delete(id));
    }
}