package com.abdelazizbardich.services.implementations;

import com.abdelazizbardich.DAO.implementation.RoleDaoImpl;
import com.abdelazizbardich.DAO.interfaces.RoleDao;
import com.abdelazizbardich.entities.Role;
import com.abdelazizbardich.services.interfaces.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao = new RoleDaoImpl();
    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role Find(long id) {
        return roleDao.find(id);
    }

    @Override
    public List<Role> getAll() {
        return roleDao.getAll();
    }

    @Override
    public Role update(Role role) {
        return roleDao.update(role);
    }

    @Override
    public boolean delete(long id) {
        return roleDao.delete(id);
    }
}
