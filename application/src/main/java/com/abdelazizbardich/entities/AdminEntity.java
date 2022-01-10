package com.abdelazizbardich.entities;


import javax.persistence.*;

@Entity(name = "Admin")
public class AdminEntity extends UserEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user", nullable = false)
    private long idUser;

}
