package DAO.interfaces;

import models.Admin;

import java.util.ArrayList;

public interface AdminDao {
    Admin add(Admin admin);
    Admin find(long id);
    ArrayList<AdminDao> getAll(long id);
    Admin update(Admin admin);
    boolean delete(long id);
}
