package com.abdelazizbardich.services.implementations;

import com.abdelazizbardich.DAO.implementation.AddressDaoImpl;
import com.abdelazizbardich.DAO.interfaces.AddressDao;
import com.abdelazizbardich.entities.Address;
import com.abdelazizbardich.services.interfaces.AddressService;

import java.util.List;

public class AddressServiceImpl implements AddressService {
    private AddressDao addressDao = new AddressDaoImpl();
    @Override
    public Address add(Address address) {
        return addressDao.add(address);
    }

    @Override
    public Address Find(long id) {
        return  addressDao.find(id);
    }

    @Override
    public List<Address> getAll() {
        return addressDao.getAll();
    }

    @Override
    public Address update(Address address) {
        return addressDao.update(address);
    }

    @Override
    public boolean delete(long id) {
        return addressDao.delete(id);
    }
}
