package DAO;


import entities.Employee;
import factories.PersistenceFactory;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;

public class EmployeeDao implements DAO<Employee>{
    private EntityManager entityManager = PersistenceFactory.getInstance().getEntityManager();

    @Override
    public boolean add(Employee employee) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public ArrayList<Employee> getAll() {
        return null;
    }

    @Override
    public Employee findById(long id) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public boolean update(Employee object) {
        return false;
    }
}
