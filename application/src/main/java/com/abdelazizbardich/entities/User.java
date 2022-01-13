package com.abdelazizbardich.entities;


import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user", nullable = false)
    private Long idUser;

    @Column( name = "first_name" )
    private String firstName;

    @Column( name = "last_name" )
    private String lastName;

    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToOne(optional = false)
    @JoinColumn(name = "id_role", referencedColumnName = "id_role")
    private Role role;

    @OneToOne(optional = false)
    @JoinColumn(name = "id_address", referencedColumnName = "id_address")
    private Address address;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
