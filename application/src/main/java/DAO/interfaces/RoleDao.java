package DAO.interfaces;

import models.Role;

import java.util.ArrayList;

public interface RoleDao {
    Role add(Role role);
    Role find(long id);
    ArrayList<Role> getAll(long id);
    Role update(Role role);
    boolean delete(long id);
}
