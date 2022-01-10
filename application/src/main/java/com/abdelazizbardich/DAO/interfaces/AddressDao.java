package DAO.interfaces;

import models.Address;

import java.util.ArrayList;

public interface AddressDao {
    Address add(Address address);
    Address find(long id);
    ArrayList<Address> getAll(long id);
    Address update(Address address);
    boolean delete(long id);
}
