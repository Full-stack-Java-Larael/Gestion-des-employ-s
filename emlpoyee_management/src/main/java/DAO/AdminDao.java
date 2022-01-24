package DAO;


import entities.Admin;
import factories.PersistenceFactory;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;

public class AdminDao implements DAO<Admin>{
    private EntityManager entityManager = PersistenceFactory.getInstance().getEntityManager();
    @Override
    public boolean add(Admin admin) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(admin);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public ArrayList<Admin> getAll() {
        return null;
    }

    @Override
    public Admin findById(long id) {
        return null;
    }

    @Override
    public boolean update(Admin object) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
