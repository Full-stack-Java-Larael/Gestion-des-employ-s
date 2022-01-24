package Services;

import entities.Address;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AddressServiceTest {

    @Test
    void add() {
        Address address = new Address();
        address.setCity("rabat");
        address.setCountry("morocco");
        address.setStreet("imam malik");
        address.setPostalCode(34567);
        Service service = new AddressService();
        assertTrue(service.add(address));
    }

    @Test
    void getAll() {
        Service service = new AddressService();
        assertInstanceOf(new ArrayList<Address>().getClass(),service.getAll());
    }

    @Test
    void findById() {
        Service service = new AddressService();
        assertInstanceOf(Address.class,service.findById((long)1));
    }

    @Test
    void update() {
        Address address = new Address();
        address.setIdAddress((long)1);
        address.setCity("rabat");
        address.setCountry("morocco");
        address.setStreet("imam malik");
        address.setPostalCode(34567);
        Service service = new AddressService();
        assertTrue(service.update(address));
    }

    @Test
    void delete() {
        Service service = new AddressService();
        assertTrue(service.delete((long)1));
    }
}