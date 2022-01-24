package DAO;

import entities.Address;
import factories.PersistenceFactory;
import jakarta.persistence.EntityManager;
import java.util.ArrayList;

public class AddressDao implements DAO<Address>{
    private EntityManager entityManager = PersistenceFactory.getInstance().getEntityManager();
    @Override
    public boolean add(Address address) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(address);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
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
