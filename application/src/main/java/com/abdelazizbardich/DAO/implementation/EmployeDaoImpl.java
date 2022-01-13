package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.DAO.interfaces.EmployeDao;
import com.abdelazizbardich.entities.Address;
import com.abdelazizbardich.entities.Employe;
import com.abdelazizbardich.entities.Role;
import com.abdelazizbardich.hibernate.HSessionFactory;
import org.hibernate.Session;

import java.util.ArrayList;

public class EmployeDaoImpl implements EmployeDao {


    @Override
    public boolean setAsGoneOut() {
        return false;
    }


    @Override
    public Employe add(Employe employe) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        employe.setIdUser((long)session.save(employe));
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
    public ArrayList<Employe> getAll(long id) {
        return null;
    }

    @Override
    public Employe update(Employe employe) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
