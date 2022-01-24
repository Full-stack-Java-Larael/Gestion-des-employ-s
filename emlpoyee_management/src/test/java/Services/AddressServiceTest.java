package Services;

import entities.Address;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressServiceTest {

    @Test
    void add() {
        Address address = new Address();
        address.setCity("rabat");
        address.setCity("morocco");
        address.setStreet("imam malik");
        address.setPostalCode(34567);
        Service service = new AddressService();
        assertTrue(service.add(address));
    }

    @Test
    void getAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}