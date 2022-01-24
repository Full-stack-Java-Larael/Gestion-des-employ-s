package DAO;

import java.util.ArrayList;

public interface DAO<T> {
    boolean add(T object);
    ArrayList<T> getAll();
    T findById(long id);
    boolean update(T object);
    boolean delete(long id);
}
