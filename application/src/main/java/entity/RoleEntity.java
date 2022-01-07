package entity;

import javax.persistence.*;

@Entity
@Table(name = "role", schema = "gestion_employe", catalog = "")
public class RoleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_role", nullable = false)
    private long idRole;
    @Basic
    @Column(name = "name", nullable = false, length = 45)
    private String name;

    public long getIdRole() {
        return idRole;
    }

    public void setIdRole(long idRole) {
        this.idRole = idRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (idRole != that.idRole) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idRole ^ (idRole >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
