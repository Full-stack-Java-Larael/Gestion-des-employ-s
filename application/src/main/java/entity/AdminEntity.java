package entity;

import javax.persistence.*;

@Entity
@Table(name = "admin", schema = "gestion_employe", catalog = "")
public class AdminEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_user")
    private long idUser;
    @OneToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user", nullable = false)
    private UserEntity userByIdUser;

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

    public UserEntity getUserByIdUser() {
        return userByIdUser;
    }

    public void setUserByIdUser(UserEntity userByIdUser) {
        this.userByIdUser = userByIdUser;
    }
}
