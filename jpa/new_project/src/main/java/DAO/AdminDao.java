package DAO;


import entities.Admin;
import factories.PersistenceFactory;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;

public class AdminDao implements DAO<Admin>{
    private EntityManager entityManager = PersistenceFactory.getInstance().getEntityManager();
    @Override
    public Admin add(Admin admin) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(admin);
            entityManager.getTransaction().commit();
            return admin;
        }catch (Exception e){
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public ArrayList<Admin> getAll() {
        try {
            entityManager.getTransaction().begin();
            ArrayList<Admin> admins = new ArrayList<Admin>(entityManager.createQuery("SELECT e FROM Admin e").getResultList());
            return admins;
        }catch (Exception e){
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public Admin findById(long id) {
        try {
            return entityManager.find(Admin.class,id);
        }catch (Exception e){
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public boolean update(Admin admin) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(admin);
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
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.find(Admin.class,id));
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }
    }
}
