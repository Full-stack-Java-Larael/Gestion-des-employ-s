package entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "entry_date")
    private Date entryDate = new Date(System.currentTimeMillis());
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

    @Override
    public String toString() {
        return "Employee{" +
                "entryDate=" + entryDate +
                ", goneOut=" + goneOut +
                '}';
    }
}
