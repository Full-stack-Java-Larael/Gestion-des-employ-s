package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.DAO.interfaces.EmployeDao;
import com.abdelazizbardich.entities.Employe;
import com.abdelazizbardich.entities.Employe;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.sql.Date;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeDaoImplTest {
    private static long id;

    @Test
    @Order(5)
    void setAsGoneOut() {
        assertTrue(new EmployeDaoImpl().setAsGoneOut(id));
    }

    @Test
    @Order(1)
    void add() {
        Employe employe = new Employe();
        employe.setFirstName("amqsdziz");
        employe.setLastName("bamrdiqsqch");
        employe.setEmail("aziz@emxaiqsdl.com");
        employe.setPassword("pass1234qsfqsf");
        employe.setEntryDate(new Date(2022,1,14));
        employe.setAddress(new AddressDaoImpl().getAll().get(0));
        employe.setRole(new RoleDaoImpl().getAll().get(0));
        employe = new EmployeDaoImpl().add(new Employe());
        assertInstanceOf(Employe.class,employe);
        id = employe.getIdUser();
    }

    @Test
    @Order(2)
    void find() {
        assertInstanceOf(Employe.class,new EmployeDaoImpl().find(id));
    }

    @Test
    @Order(3)
    void getAll() {
        assertInstanceOf(new ArrayList<Employe>().getClass(),new EmployeDaoImpl().getAll());
    }

    @Test
    @Order(4)
    void update() {
        Employe employe = new Employe();
        employe.setIdUser(id);
        employe.setFirstName("new aziz");
        employe.setLastName("new bardich");
        employe.setEmail("new.aziz@email.com");
        employe.setPassword("pass1234qsfqsf");
        employe.setEntryDate(new Date(2022,1,14));
        employe.setAddress(new AddressDaoImpl().getAll().get(0));
        employe.setRole(new RoleDaoImpl().getAll().get(0));
        assertInstanceOf(Employe.class,new EmployeDaoImpl().update(employe));
    }

    @Test
    @Order(6)
    void delete() {
//        assertTrue(new EmployeDaoImpl().delete(id));
    }
}