package com.abdelazizbardich.DAO.interfaces;


import com.abdelazizbardich.models.Role;

import java.util.ArrayList;
import java.util.List;

public interface RoleDao {
    Role add(Role role);
    Role find(long id);
    ArrayList<Role> getAll();
    Role update(Role role);
    boolean delete(long id);
}
