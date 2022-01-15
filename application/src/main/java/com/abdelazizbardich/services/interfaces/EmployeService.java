package com.abdelazizbardich.services.interfaces;

import java.util.List;
import com.abdelazizbardich.entities.Employe;
public interface EmployeService {

    Employe add(Employe employe);
    Employe Find(long id);
    List<Employe> getAll();
    Employe update(Employe employe);
    boolean delete(long id);
}
