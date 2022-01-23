package com.abdelazizbaridch.DAO.interfaces;

import java.util.List;

public interface Dao {
    boolean add(Object object);
    List<Object> getAll();
    Object find(long id);
    boolean update(Object object);
    boolean delete(long id);
}
