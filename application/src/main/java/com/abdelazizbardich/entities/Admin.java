package com.abdelazizbardich.entities;


import javax.persistence.*;

@Entity(name = "Admin")
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "id_user_adm"))
public class Admin extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user", nullable = false)
    private long idUser;

}
