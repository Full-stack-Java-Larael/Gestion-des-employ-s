package Services;


import DAO.DAO;
import DAO.AddressDao;
import entities.Address;

import java.util.ArrayList;

public class AddressService implements Service<Address>{
    private DAO dao = new AddressDao();
    @Override
    public boolean add(Address address) {
        return dao.add(address);
    }

    @Override
    public ArrayList<Address> getAll() {
        return null;
    }

    @Override
    public Address findById(long id) {
        return null;
    }

    @Override
    public boolean update(Address object) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
