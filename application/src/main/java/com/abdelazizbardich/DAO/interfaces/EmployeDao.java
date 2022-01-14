package com.abdelazizbardich.DAO.interfaces;

import com.abdelazizbardich.entities.Employe;

import java.util.List;

public interface EmployeDao {
    boolean setAsGoneOut(long id);
    Employe add(Employe employe);
    Employe find(long id);
    List<Employe> getAll();
    Employe update(Employe employe);
    boolean delete(long id);
}
