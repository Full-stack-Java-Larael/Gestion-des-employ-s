package com.abdelazizbardich.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "employe")
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "id_user_emp"))
public class Employe extends User {

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
        return super.toString()+"Employe{" +
                ", entryDate=" + entryDate +
                ", goneOut=" + goneOut +
                '}';
    }
}
