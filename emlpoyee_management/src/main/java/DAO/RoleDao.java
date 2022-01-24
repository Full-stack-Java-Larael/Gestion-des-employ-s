package DAO;

import entities.Role;
import factories.PersistenceFactory;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;

public class RoleDao implements DAO<Role>{
    private EntityManager entityManager = PersistenceFactory.getInstance().getEntityManager();
    @Override
    public boolean add(Role role) {
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
    public ArrayList<Role> getAll() {
        return null;
    }

    @Override
    public Role findById(long id) {
        return null;
    }

    @Override
    public boolean update(Role object) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
