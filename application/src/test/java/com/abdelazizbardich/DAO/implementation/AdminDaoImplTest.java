package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.entities.Admin;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Order(3)
class AdminDaoImplTest {
    private static long id;
    @Test
    @Order(1)
    void add() {
        Admin admin = new Admin();
        admin.setFirstName("amziz");
        admin.setLastName("bamrdich");
        admin.setEmail("aziz@emxail.com");
        admin.setPassword("pass1234");
        admin.setAddress(new AddressDaoImpl().getAll().get(0));
        admin.setRole(new RoleDaoImpl().getAll().get(0));
        admin = new AdminDaoImpl().add(admin);
        System.out.println(admin);
        assertInstanceOf(Admin.class,admin);
        id = admin.getIdUser();
    }

    @Test
    @Order(2)
    void find() {
        assertInstanceOf(Admin.class,new AdminDaoImpl().find(id));
    }

    @Test
    @Order(3)
    void getAll() {
        assertInstanceOf(new ArrayList<Admin>().getClass() ,new AdminDaoImpl().getAll());
    }

    @Test
    @Order(4)
    void update() {
        Admin admin = new Admin();
        admin.setIdUser(id);
        admin.setFirstName("new aziz");
        admin.setLastName("new bardich");
        admin.setEmail("new.aziz@email.com");
        admin.setPassword("pass1234");
        admin.setAddress(new AddressDaoImpl().getAll().get(0));
        admin.setRole(new RoleDaoImpl().getAll().get(0));
        assertInstanceOf(Admin.class,new AdminDaoImpl().update(admin));
    }

    @Test
    @Order(5)
    void delete() {
//        assertTrue(new AdminDaoImpl().delete(id));
    }
}