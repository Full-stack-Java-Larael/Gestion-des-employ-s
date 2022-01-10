package DAO.interfaces;

import models.Employe;

import java.util.ArrayList;

public interface UserDao {

    boolean setAsGoneOut();
    Employe get();
    ArrayList<Employe> getAll();
    Employe add();
    Employe update();
    boolean delete();
}
