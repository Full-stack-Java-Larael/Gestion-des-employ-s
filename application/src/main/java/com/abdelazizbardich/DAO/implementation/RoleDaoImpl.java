package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.DAO.interfaces.RoleDao;
import com.abdelazizbardich.entities.Role;
import com.abdelazizbardich.hibernate.HSessionFactory;
import org.hibernate.Session;

import java.util.ArrayList;

public class RoleDaoImpl implements RoleDao {

    @Override
    public Role add(Role role) {

        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.save(role);
        session.getTransaction().commit();
        session.close();
        return role;
    }

    @Override
    public Role find(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Role role = session.get(Role.class,id);
        session.close();
        return role;
    }

    @Override
    public ArrayList<Role> getAll() {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        ArrayList<Role> roles = (ArrayList<Role>) session.createCriteria(Role.class).list();
        session.close();
        return roles;
    }

    @Override
    public Role update(Role role) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.find(Role.class,role.getId_role());
        session.merge(role);
        session.getTransaction().commit();
        session.close();
        return role;
    }

    @Override
    public boolean delete(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        Role roleEntity = session.load(Role.class,id);
        session.delete(roleEntity);
        session.getTransaction().commit();
        return true;
    }
}
