package com.abdelazizbardich.services.interfaces;

import com.abdelazizbardich.entities.Admin;

import java.util.List;

public interface AdminService {

    Admin add(Admin admin);
    Admin Find(long id);
    List<Admin> getAll();
    Admin update(Admin admin);
    boolean delete(long id);
}
