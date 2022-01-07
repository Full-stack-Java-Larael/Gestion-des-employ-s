package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employe", schema = "gestion_employe", catalog = "")
public class EmployeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_user", nullable = false)
    private long idUser;
    @Basic
    @Column(name = "entry_date", nullable = false)
    private Date entryDate;
    @Basic
    @Column(name = "gone_out", nullable = false)
    private byte goneOut;
    @OneToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user", nullable = false)
    private UserEntity userByIdUser;

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public byte getGoneOut() {
        return goneOut;
    }

    public void setGoneOut(byte goneOut) {
        this.goneOut = goneOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeEntity that = (EmployeEntity) o;

        if (idUser != that.idUser) return false;
        if (goneOut != that.goneOut) return false;
        if (entryDate != null ? !entryDate.equals(that.entryDate) : that.entryDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idUser ^ (idUser >>> 32));
        result = 31 * result + (entryDate != null ? entryDate.hashCode() : 0);
        result = 31 * result + (int) goneOut;
        return result;
    }

    public UserEntity getUserByIdUser() {
        return userByIdUser;
    }

    public void setUserByIdUser(UserEntity userByIdUser) {
        this.userByIdUser = userByIdUser;
    }
}
