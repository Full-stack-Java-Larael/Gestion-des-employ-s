package Services;



import DAO.DAO;
import DAO.RoleDao;
import entities.Role;

import java.util.ArrayList;

public class RoleService implements Service<Role>{
    private DAO dao = new RoleDao();
    @Override
    public Role add(Role role) {
        return (Role) dao.add(role);
    }

    @Override
    public ArrayList<Role> getAll() {
        return dao.getAll();
    }

    @Override
    public Role findById(long id) {
        return (Role) dao.findById(id);
    }

    @Override
    public boolean update(Role role) {
        return dao.update(role);
    }

    @Override
    public boolean delete(long id) {
        return dao.delete(id);
    }
}
