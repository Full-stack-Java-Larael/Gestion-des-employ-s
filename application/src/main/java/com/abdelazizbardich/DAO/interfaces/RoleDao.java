package DAO.interfaces;


import models.Role;
import java.util.List;

public interface RoleDao {
    Role add(Role role);
    Role find(long id);
    List<Role> getAll();
    Role update(Role role);
    boolean delete(long id);
}
