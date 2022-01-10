package com.abdelazizbardich.DAO.interfaces;

import com.abdelazizbardich.models.Employe;

import java.util.ArrayList;

public interface UserDao {

    boolean setAsGoneOut();
    Employe get();
    ArrayList<Employe> getAll();
    Employe add();
    Employe update();
    boolean delete();
}
