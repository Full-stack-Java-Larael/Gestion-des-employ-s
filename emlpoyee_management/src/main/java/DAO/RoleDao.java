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
        try {
            ArrayList<Role> roles = new ArrayList<>(entityManager.createQuery("SELECT e FROM Role e").getResultList());
            return roles;
        }catch (Exception e){
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public Role findById(long id) {
        try {
            Role role = entityManager.find(Role.class,id);
            return  role;
        }catch (Exception e){
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public boolean update(Role role) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(role);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e){
            return false;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public boolean delete(long id) {
        try {
            entityManager.remove(entityManager.find(Role.class,id));
            return true;
        }catch (Exception e){
            return false;
        }finally {
            entityManager.close();
        }
    }
}
