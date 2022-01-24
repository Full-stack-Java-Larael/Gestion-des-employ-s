package Services;


import entities.Role;

import java.util.ArrayList;

public class RoleService implements Service<Role>{

    @Override
    public boolean add(Role object) {
        return false;
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
    public boolean update(Role object) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
