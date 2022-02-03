package com.abdelazizbardich.services.implementations;

import com.abdelazizbardich.DAO.implementation.AdminDaoImpl;
import com.abdelazizbardich.DAO.interfaces.AdminDao;
import com.abdelazizbardich.entities.Admin;
import com.abdelazizbardich.services.interfaces.AdminService;

import java.util.List;


public class AdminServiceImpl implements AdminService {
    private AdminDao adminDao = new AdminDaoImpl();
    @Override
    public Admin add(Admin admin) {
        return adminDao.add(admin);
    }

    @Override
    public Admin Find(long id) {
        return adminDao.find(id);
    }

    @Override
    public List<Admin> getAll() {
        return adminDao.getAll();
    }

    @Override
    public Admin update(Admin admin) {
        return adminDao.update(admin);
    }

    @Override
    public boolean delete(long id) {
        return adminDao.delete(id);
    }

    @Override
    public boolean login(String email, String password) {
        AdminDao adminDao = new AdminDaoImpl();
        Admin admin = adminDao.findByEmail(email);
        if(admin == null){return false;}
        if(password.equals(admin.getPassword())){
            return true;
        }
        return false;
    }

    @Override
    public boolean changePassword(String olPassword, String newPassword) {
        return false;
    }
}
