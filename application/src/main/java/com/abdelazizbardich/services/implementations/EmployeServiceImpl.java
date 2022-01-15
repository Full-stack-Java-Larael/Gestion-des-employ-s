package com.abdelazizbardich.services.implementations;

import com.abdelazizbardich.DAO.implementation.EmployeDaoImpl;
import com.abdelazizbardich.DAO.interfaces.EmployeDao;
import com.abdelazizbardich.entities.Employe;
import com.abdelazizbardich.services.interfaces.EmployeService;

import java.util.List;

public class EmployeServiceImpl implements EmployeService {
    private EmployeDao employeDao = new EmployeDaoImpl();
    @Override
    public Employe add(Employe employe) {
        return employeDao.add(employe);
    }

    @Override
    public Employe Find(long id) {
        return employeDao.find(id);
    }

    @Override
    public List<Employe> getAll() {
        return employeDao.getAll();
    }

    @Override
    public Employe update(Employe employe) {
        return employeDao.update(employe);
    }

    @Override
    public boolean delete(long id) {
        return employeDao.delete(id);
    }
}
