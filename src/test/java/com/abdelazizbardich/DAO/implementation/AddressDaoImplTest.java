package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.entities.Address;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Order(1)
class AddressDaoImplTest {
    private static long id;
    @Test
    @Order(1)
    void add() {
        Address address = new Address();
        address.setPostalCode(4365546);
        address.setCity("sdfsdf");
        address.setStreet("sfzdsf");
        address.setCountry("dsfsdf");
        address = new AddressDaoImpl().add(address);
        assertInstanceOf(Address.class,address);
        this.id = address.getIdAddress();
    }

    @Test
    @Order(2)
    void find() {
        assertInstanceOf(Address.class,new AddressDaoImpl().find(this.id));
    }

    @Test
    @Order(3)
    void getAll() {
        assertInstanceOf(new ArrayList<Address>().getClass(),new AddressDaoImpl().getAll());
    }

    @Test
    @Order(4)
    void update() {
        Address address = new Address();
        address.setPostalCode(4365546);
        address.setIdAddress(id);
        address.setCity("new sdfsdf");
        address.setStreet("new sfzdsf");
        address.setCountry("new dsfsdf");
        address = new AddressDaoImpl().update(address);
        assertInstanceOf(Address.class,address);
        id = address.getIdAddress();
    }

    @Test
    @Order(5)
    void delete() {
//        assertTrue(new AddressDaoImpl().delete(id));
    }
}