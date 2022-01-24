package DAO;

import factories.PersistenceFactory;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;

public class RoleDao implements DAO<entities.Role>{
    private EntityManager entityManager = PersistenceFactory.getInstance().getEntityManager();
    @Override
    public boolean add(entities.Role role) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(role);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public ArrayList<entities.Role> getAll() {
        return null;
    }

    @Override
    public entities.Role findById(long id) {
        return null;
    }

    @Override
    public boolean update(entities.Role object) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
