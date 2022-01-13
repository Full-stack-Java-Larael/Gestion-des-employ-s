package com.abdelazizbardich.DAO.interfaces;

import com.abdelazizbardich.entities.Employe;

import java.util.ArrayList;

public interface EmployeDao {
    boolean setAsGoneOut();
    Employe add(Employe employe);
    Employe find(long id);
    ArrayList<Employe> getAll(long id);
    Employe update(Employe employe);
    boolean delete(long id);
}
