package com.abdelazizbardich.DAO.interfaces;

import com.abdelazizbardich.entities.Employe;

import java.util.ArrayList;

public interface UserDao {


    Employe get();
    ArrayList<Employe> getAll();
    Employe add();
    Employe update();
    boolean delete();
}
