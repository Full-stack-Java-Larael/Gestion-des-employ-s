package DAO.implementation;

import DAO.interfaces.RoleDao;

import entity.RoleEntity;
import models.Role;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class RoleDaoImpl implements RoleDao {
    @Override
    public Role add(Role role) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            RoleEntity roleEntity = new RoleEntity();
            roleEntity.setName(role.getName());
            entityManager.persist(roleEntity);
            transaction.commit();
            return role;
        }finally {
            if(transaction.isActive()){
                transaction.rollback();
            }
        }
    }

    @Override
    public Role find(long id) {
        return null;
    }

    @Override
    public ArrayList<Role> getAll(long id) {
        return null;
    }

    @Override
    public Role update(Role role) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
