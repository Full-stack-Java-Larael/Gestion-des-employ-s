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
        try {
            entityManager.getTransaction().begin();
            ArrayList<Address> addresses =  new ArrayList<Address>(entityManager.createQuery("SELECT e from Address e").getResultList());
            return addresses;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Address findById(long id) {
        try {
            entityManager.getTransaction().begin();
            Address address =  entityManager.find(Address.class,id);
            return address;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public boolean update(Address address) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(address);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean delete(long id) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.find(Address.class,id));
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
