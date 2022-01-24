package Services;


import DAO.AdminDao;
import DAO.DAO;
import entities.Admin;

import java.util.ArrayList;

public class AdminService implements Service<Admin> {
    private DAO dao = new AdminDao();
    @Override
    public boolean add(Admin admin) {
        return dao.add(admin);
    }

    @Override
    public ArrayList<Admin> getAll() {
        return null;
    }

    @Override
    public Admin findById(long id) {
        return null;
    }

    @Override
    public boolean update(Admin admin) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
