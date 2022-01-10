package com.abdelazizbardich;


import com.abdelazizbardich.DAO.implementation.AddressDaoImpl;
import com.abdelazizbardich.DAO.interfaces.AddressDao;
import com.abdelazizbardich.models.Address;

public class Main {

    public static void main(String[] args){
        AddressDao addressDao = new AddressDaoImpl();

        System.out.println(addressDao.delete(16));
    }
}
