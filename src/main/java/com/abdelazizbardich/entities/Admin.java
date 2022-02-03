package com.abdelazizbardich.entities;


import javax.persistence.*;

@Entity(name = "Admin")
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "id_user_adm"))
public class Admin extends User {
}
