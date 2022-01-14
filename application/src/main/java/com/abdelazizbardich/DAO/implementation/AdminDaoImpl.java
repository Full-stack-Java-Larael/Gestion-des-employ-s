package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.DAO.interfaces.AdminDao;
import com.abdelazizbardich.entities.Address;
import com.abdelazizbardich.entities.Admin;
import com.abdelazizbardich.hibernate.HSessionFactory;
import org.hibernate.Session;

import java.util.List;


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
        Admin admin = session.find(Admin.class,id);
        session.close();
        return admin;
    }

    @Override
    public List<Admin> getAll() {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        List<Admin> admins = session.createCriteria(Admin.class).list();
        session.close();
        return admins;
    }

    @Override
    public Admin update(Admin admin) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.merge(admin);
        session.getTransaction().commit();
        session.close();
        return admin;
    }

    @Override
    public boolean delete(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Admin admin = session.find(Admin.class,id);
        session.delete(admin);
        session.getTransaction().commit();
        return true;
    }
}
