package entities;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "employe")
public class EmployeEntity extends UserEntity{
    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user", nullable = false)
    @OneToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private UserEntity user;

    @Column(name = "entry_date")
    private Date entryDate;

    @Column(name = "gone_out")
    private boolean goneOut;


    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public boolean isGoneOut() {
        return goneOut;
    }

    public void setGoneOut(boolean goneOut) {
        this.goneOut = goneOut;
    }
}
