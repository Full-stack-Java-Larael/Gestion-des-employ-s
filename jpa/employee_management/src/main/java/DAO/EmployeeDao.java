package DAO;


import entities.Employee;
import factories.PersistenceFactory;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;

public class EmployeeDao implements DAO<Employee>{
    private EntityManager entityManager = PersistenceFactory.getInstance().getEntityManager();

    @Override
    public Employee add(Employee employee) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            return employee;
        }catch (Exception e){
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public ArrayList<Employee> getAll() {
        try {
            ArrayList<Employee> employees = new ArrayList<Employee>(entityManager.createQuery("SELECT e FROM Employee e").getResultList());
            return employees;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            entityManager.close();
        }

    }

    @Override
    public Employee findById(long id) {
        try {
            Employee employee = entityManager.find(Employee.class,id);
            return employee;
        }catch (Exception e){
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public boolean update(Employee employee) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(employee);
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
            entityManager.remove(entityManager.find(Employee.class,id));
            return true;
        }catch (Exception e){
            return false;
        }finally {
            entityManager.close();
        }
    }
}
