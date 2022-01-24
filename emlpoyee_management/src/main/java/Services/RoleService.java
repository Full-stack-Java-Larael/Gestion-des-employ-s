package Services;



import DAO.DAO;
import DAO.RoleDao;
import entities.Role;

import java.util.ArrayList;

public class RoleService implements Service<Role>{
    private DAO dao = new RoleDao();
    @Override
    public boolean add(Role role) {
        return dao.add(role);
    }

    @Override
    public ArrayList<Role> getAll() {
        return null;
    }

    @Override
    public Role findById(long id) {
        return null;
    }

    @Override
    public boolean update(Role role) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
