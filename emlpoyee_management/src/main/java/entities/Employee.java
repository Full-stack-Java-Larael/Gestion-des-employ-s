package entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "employee")
@PrimaryKeyJoinColumn(foreignKey = @ForeignKey(name = "id_user"))
public class Employee extends User{

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

    @Override
    public String toString() {
        return "Employee{" +
                "entryDate=" + entryDate +
                ", goneOut=" + goneOut +
                '}';
    }
}
