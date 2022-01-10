package com.abdelazizbardich.DAO.interfaces;

import com.abdelazizbardich.models.Employe;

import java.util.ArrayList;

public interface EmployeDao {
    Employe add(Employe employe);
    Employe find(long id);
    ArrayList<Employe> getAll(long id);
    Employe update(Employe employe);
    boolean delete(long id);
}
