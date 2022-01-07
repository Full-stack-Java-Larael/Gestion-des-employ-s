package entity;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "gestion_employe", catalog = "")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_user", nullable = false)
    private long idUser;
    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Basic
    @Column(name = "email", nullable = false, length = 150)
    private String email;
    @Basic
    @Column(name = "password", nullable = false, length = -1)
    private String password;
    @Basic
    @Column(name = "id_role", nullable = false)
    private long idRole;
    @Basic
    @Column(name = "id_address", nullable = false)
    private long idAddress;



    @OneToOne(mappedBy = "userByIdUser")
    private AdminEntity adminByIdUser;
    @OneToOne(mappedBy = "userByIdUser")
    private EmployeEntity employeByIdUser;
    //@ManyToOne
    //@JoinColumn(name = "id_role", referencedColumnName = "id_role", nullable = false)
    //private RoleEntity roleByIdRole;
    //@ManyToOne
    //@JoinColumn(name = "id_address", referencedColumnName = "id_address", nullable = false)
    //private AddressEntity addressByIdAddress;

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getIdRole() {
        return idRole;
    }

    public void setIdRole(long idRole) {
        this.idRole = idRole;
    }

    public long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(long idAddress) {
        this.idAddress = idAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (idUser != that.idUser) return false;
        if (idRole != that.idRole) return false;
        if (idAddress != that.idAddress) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idUser ^ (idUser >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (int) (idRole ^ (idRole >>> 32));
        result = 31 * result + (int) (idAddress ^ (idAddress >>> 32));
        return result;
    }

    public AdminEntity getAdminByIdUser() {
        return adminByIdUser;
    }

    public void setAdminByIdUser(AdminEntity adminByIdUser) {
        this.adminByIdUser = adminByIdUser;
    }

    public EmployeEntity getEmployeByIdUser() {
        return employeByIdUser;
    }

    public void setEmployeByIdUser(EmployeEntity employeByIdUser) {
        this.employeByIdUser = employeByIdUser;
    }

    /*public RoleEntity getRoleByIdRole() {
        return roleByIdRole;
    }

    public void setRoleByIdRole(RoleEntity roleByIdRole) {
        this.roleByIdRole = roleByIdRole;
    }*/

    /*public AddressEntity getAddressByIdAddress() {
        return addressByIdAddress;
    }*/

    /*public void setAddressByIdAddress(AddressEntity addressByIdAddress) {
        this.addressByIdAddress = addressByIdAddress;
    }*/
}
