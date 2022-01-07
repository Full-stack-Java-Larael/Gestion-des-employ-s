package entity;

import javax.persistence.*;

@Entity
@Table(name = "admin", schema = "gestion_employe", catalog = "")
public class AdminEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_user", nullable = false)
    private long idUser;

    @OneToOne(orphanRemoval = true)
    @JoinTable(name = "admin_userByIdUser",
            joinColumns = @JoinColumn(name = "adminEntity_id_user"),
            inverseJoinColumns = @JoinColumn(name = "userByIdUser_id_user"))
    private UserEntity userByIdUser;

    public UserEntity getUserByIdUser() {
        return userByIdUser;
    }

    public void setUserByIdUser(UserEntity userByIdUser) {
        this.userByIdUser = userByIdUser;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminEntity that = (AdminEntity) o;

        if (idUser != that.idUser) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (idUser ^ (idUser >>> 32));
    }
}
