package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.DAO.interfaces.RoleDao;
import com.abdelazizbardich.entities.RoleEntity;
import com.abdelazizbardich.hibernate.HSessionFactory;
import com.abdelazizbardich.models.Role;
import org.hibernate.Session;

import java.util.ArrayList;

public class RoleDaoImpl implements RoleDao {

    @Override
    public Role add(Role role) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setName(role.getName());
        session.save(roleEntity);
        session.getTransaction().commit();
        session.close();
        role.setIdRole(roleEntity.getId_role());
        return role;
    }

    @Override
    public Role find(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        RoleEntity roleEntity = (RoleEntity) session.get(RoleEntity.class,id);
        session.close();
        Role role = new Role();
        role.setIdRole(roleEntity.getId_role());
        role.setName(roleEntity.getName());
        return role;
    }

    @Override
    public ArrayList<Role> getAll() {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        ArrayList<RoleEntity> roleEntities = (ArrayList<RoleEntity>) session.createCriteria(RoleEntity.class).list();
        ArrayList<Role> roles = new ArrayList<Role>();
        for (int i=0;i < roleEntities.size();i++){
            Role role = new Role();
            role.setIdRole(roleEntities.get(i).getId_role());
            role.setName(roleEntities.get(i).getName());
            roles.add(role);
        }
        session.close();
        return roles;
    }

    @Override
    public Role update(Role role) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        session.find(RoleEntity.class,role.getIdRole());
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setId_role(role.getIdRole());
        roleEntity.setName(role.getName());
        session.merge(roleEntity);
        session.getTransaction().commit();
        session.close();
        return role;
    }

    @Override
    public boolean delete(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        RoleEntity roleEntity = session.load(RoleEntity.class,id);
        session.delete(roleEntity);
        session.getTransaction().commit();
        return true;
    }
}
