package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.DAO.interfaces.EmployeDao;
import com.abdelazizbardich.entities.Employe;
import com.abdelazizbardich.hibernate.HSessionFactory;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class EmployeDaoImpl implements EmployeDao {


    @Override
    public boolean setAsGoneOut(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Employe employe = session.find(Employe.class,id);
        employe.setGoneOut(true);
        session.merge(employe);
        session.getTransaction().commit();
        session.close();
        return true;
    }


    @Override
    public Employe add(Employe employe) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.save(employe);
        session.getTransaction().commit();
        session.close();
        return employe;
    }

    @Override
    public Employe find(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Employe employe = session.find(Employe.class,id);
        session.close();
        return employe;
    }

    @Override
    public  List<Employe> getAll() {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        List<Employe> employes = session.createCriteria(Employe.class).list();
        return employes;
    }

    @Override
    public Employe update(Employe employe) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.load(Employe.class,employe.getIdUser());
        session.merge(employe);
        session.getTransaction().commit();
        session.close();
        return  employe;
    }

    @Override
    public boolean delete(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Employe employe = session.find(Employe.class,id);
        session.delete(employe);
        session.getTransaction().commit();
        session.close();
        return true;
    }
}
