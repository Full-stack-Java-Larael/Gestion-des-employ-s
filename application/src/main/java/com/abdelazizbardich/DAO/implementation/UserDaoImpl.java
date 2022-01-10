package DAO.implementation;

import DAO.interfaces.UserDao;
import models.Employe;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean setAsGoneOut() {
        return false;
    }

    @Override
    public Employe get() {
        return null;
    }

    @Override
    public ArrayList<Employe> getAll() {
        return null;
    }

    @Override
    public Employe add() {
        return null;
    }

    @Override
    public Employe update() {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }
}
