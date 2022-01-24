package Services;

import entities.Admin;

import java.util.ArrayList;

public class AdminService implements Service<Admin> {
    @Override
    public boolean add(Admin object) {
        return false;
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
    public boolean update(Admin object) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
