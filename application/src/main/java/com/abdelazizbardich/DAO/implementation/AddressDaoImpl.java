package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.DAO.interfaces.AddressDao;
import com.abdelazizbardich.entities.Address;
import com.abdelazizbardich.hibernate.HSessionFactory;
import org.hibernate.Session;

import java.util.ArrayList;

public class AddressDaoImpl implements AddressDao {
    @Override
    public Address add(Address address) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.save(add(address));
        session.getTransaction().commit();
        session.close();
        return address;
    }

    @Override
    public Address find(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Address address = session.get(Address.class,id);
        session.close();
        return address;

    }

    @Override
    public ArrayList<Address> getAll() {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        ArrayList<Address> addresss = (ArrayList<Address>) session.createCriteria(Address.class).list();

        session.close();
        return addresss;
    }

    @Override
    public Address update(Address address) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.find(Address.class,address.getIdAddress());
        session.merge(address);
        session.getTransaction().commit();
        session.close();
        return address;
    }

    @Override
    public boolean delete(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Address address = session.load(Address.class,id);
        session.delete(address);
        session.getTransaction().commit();
        return true;
    }
}
