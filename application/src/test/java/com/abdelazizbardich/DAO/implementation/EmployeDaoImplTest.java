package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.DAO.interfaces.EmployeDao;
import com.abdelazizbardich.models.Address;
import com.abdelazizbardich.models.Employe;
import com.abdelazizbardich.models.Role;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeDaoImplTest {

    @Test
    void setAsGoneOut() {
    }

    @Test
    void add() {

    }

    @Test
    void find() {
        EmployeDao employeDao = new EmployeDaoImpl();
        System.out.println(employeDao.find(1));
    }

    @Test
    void getAll() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}