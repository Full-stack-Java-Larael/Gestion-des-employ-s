package com.abdelazizbaridch.entities;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  @Table(name = "admin")
@PrimaryKeyJoinColumn(name = "id_user",referencedColumnName = "id_user",foreignKey = @ForeignKey(name = "user_admin"))
public class Admin extends User  implements java.io.Serializable{
    @Override
    public String toString() {
        return super.toString()+"Admin{}";
    }
}
