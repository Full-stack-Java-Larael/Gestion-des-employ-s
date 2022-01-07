import DAO.implementation.RoleDaoImpl;
import DAO.interfaces.RoleDao;
import models.Role;

public class Main {
    public static void main(String[]args){
        Role role = new Role();
        role.setName("user");
        RoleDao roleDao = new RoleDaoImpl();
        roleDao.add(role);
    }
}
