package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.DAO.interfaces.AdminDao;
import com.abdelazizbardich.entities.Address;
import com.abdelazizbardich.entities.Admin;
import com.abdelazizbardich.entities.Role;
import com.abdelazizbardich.hibernate.HSessionFactory;
import org.hibernate.Session;

import java.util.ArrayList;

public class AdminDaoImpl implements AdminDao {
    @Override
    public Admin add(Admin admin) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        admin.setIdUser((long)session.save(admin));
        session.getTransaction().commit();
        session.close();
        return admin;
    }

    @Override
    public Admin find(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Admin admin = (Admin) session.find(Admin.class,id);
        session.close();
        return admin;
    }

    @Override
    public ArrayList<AdminDao> getAll(long id) {
        return null;
    }

    @Override
    public Admin update(Admin admin) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Admin admin = session.load(Admin.class,id);
        session.delete(admin);
        session.getTransaction().commit();
        return true;
    }
}
