package DAO;

import entities.Address;

import java.util.ArrayList;

public interface DAO<T> {
    T add(T object);
    ArrayList<T> getAll();
    T findById(long id);
    boolean update(T object);
    boolean delete(long id);
}
