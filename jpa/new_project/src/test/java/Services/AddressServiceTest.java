package Services;

import entities.Address;
import entities.Role;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AddressServiceTest {
    private static long id;
    @Test
    @Order(1)
    void add() {
        Address address = new Address();
        address.setCity("rabat");
        address.setCountry("morocco");
        address.setStreet("imam malik");
        address.setPostalCode(34567);

        Service service = new AddressService();
        assertInstanceOf(Address.class,service.add(address));
        id = address.getIdAddress();
    }

    @Test
    @Order(4)
    void getAll() {

        Service service = new AddressService();
        assertInstanceOf(new ArrayList<Address>().getClass(),service.getAll());
    }

    @Test
    @Order(2)
    void findById() {

        Service service = new AddressService();
        assertInstanceOf(Address.class,service.findById(id));
    }

    @Test
    @Order(3)
    void update() {
        Address address = new Address();
        address.setIdAddress(id);
        address.setCity("rabat");
        address.setCountry("usa");
        address.setStreet("imam malik");
        address.setPostalCode(34567);

        Service service = new AddressService();
        assertTrue(service.update(address));
    }

    @Test
    @Order(5)
    void delete() {
        Service service = new AddressService();
        assertTrue(service.delete(id));
    }
}