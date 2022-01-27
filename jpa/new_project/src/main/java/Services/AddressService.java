package Services;


import DAO.DAO;
import DAO.AddressDao;
import entities.Address;

import java.util.ArrayList;

public class AddressService implements Service<Address>{
    private DAO dao = new AddressDao();
    @Override
    public Address add(Address address) {
        return (Address) dao.add(address);
    }

    @Override
    public ArrayList<Address> getAll() {
        return dao.getAll();
    }

    @Override
    public Address findById(long id) {
        return (Address) dao.findById((long) id);
    }


    @Override
    public boolean update(Address address) {
        return dao.update(address);
    }

    @Override
    public boolean delete(long id) {
        return dao.delete(id);
    }
}
