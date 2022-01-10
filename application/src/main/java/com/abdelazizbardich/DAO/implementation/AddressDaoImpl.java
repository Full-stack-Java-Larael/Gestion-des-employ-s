package com.abdelazizbardich.DAO.implementation;

import com.abdelazizbardich.DAO.interfaces.AddressDao;
import com.abdelazizbardich.entities.AddressEntity;
import com.abdelazizbardich.hibernate.HSessionFactory;
import com.abdelazizbardich.models.Address;
import com.abdelazizbardich.models.Address;
import org.hibernate.Session;

import java.util.ArrayList;

public class AddressDaoImpl implements AddressDao {
    @Override
    public Address add(Address address) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCity(address.getCity());
        addressEntity.setCountry(address.getCountry());
        addressEntity.setStreet(address.getStreet());
        addressEntity.setPostalCode(address.getPostal_code());

        session.save(addressEntity);
        session.getTransaction().commit();
        session.close();
        address.setId_address(addressEntity.getIdAddress());
        return address;
    }

    @Override
    public Address find(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        AddressEntity addressEntity = (AddressEntity) session.get(AddressEntity.class,id);
        session.close();
        Address address = new Address();
        address.setId_address(addressEntity.getIdAddress());
        address.setCity(addressEntity.getCity());
        address.setCountry(addressEntity.getCountry());
        address.setStreet(addressEntity.getStreet());
        address.setPostal_code(addressEntity.getPostalCode());
        return address;

    }

    @Override
    public ArrayList<Address> getAll() {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        ArrayList<AddressEntity> addressEntities = (ArrayList<AddressEntity>) session.createCriteria(AddressEntity.class).list();
        ArrayList<Address> addresss = new ArrayList<Address>();
        for (int i=0;i < addressEntities.size();i++){
            Address address = new Address();
            address.setId_address(addressEntities.get(i).getIdAddress());
            address.setCity(addressEntities.get(i).getCity());
            address.setCountry(addressEntities.get(i).getCountry());
            address.setStreet(addressEntities.get(i).getStreet());
            address.setPostal_code(addressEntities.get(i).getPostalCode());
            addresss.add(address);
        }
        session.close();
        return addresss;
    }

    @Override
    public Address update(Address address) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();

        session.find(AddressEntity.class,address.getId_address());
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setIdAddress(address.getId_address());

        addressEntity.setStreet(address.getStreet());
        addressEntity.setCity(address.getCity());
        addressEntity.setCountry(address.getCountry());
        addressEntity.setPostalCode(address.getPostal_code());
        session.merge(addressEntity);
        session.getTransaction().commit();
        session.close();
        return address;
    }

    @Override
    public boolean delete(long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        AddressEntity addressEntity = session.load(AddressEntity.class,id);
        session.delete(addressEntity);
        session.getTransaction().commit();
        return true;
    }
}
