package models;

public class Role {
    private int idRole;
    private String name;

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "idRole=" + idRole +
                ", name='" + name + '\'' +
                '}';
    }
}
