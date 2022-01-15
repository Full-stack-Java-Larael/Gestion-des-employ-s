package com.abdelazizbardich.services.interfaces;

import com.abdelazizbardich.entities.Role;

import java.util.List;

public interface RoleService {

    Role add(Role role);
    Role Find(long id);
    List<Role> getAll();
    Role update(Role role);
    boolean delete(long id);

}
