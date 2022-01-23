package com.abdelazizbaridch.entities;

import javax.persistence.*;
import java.sql.Date;
@Entity @Table(name = "employee")
@PrimaryKeyJoinColumn(name = "id_user",referencedColumnName = "id_user",foreignKey = @ForeignKey(name = "user_employee"))
public class Employee extends User  implements java.io.Serializable{
    @Column(name = "entry_date",nullable = false,length = 45)
    private Date entryDate = new Date(System.currentTimeMillis());
    @Column(name = "gone_out")
    private boolean goneOut = false;

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
        return super.toString()+"Employee{" +
                "entryDate=" + entryDate +
                ", goneOut=" + goneOut +
                '}';
    }
}
