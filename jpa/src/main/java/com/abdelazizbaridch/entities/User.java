package com.abdelazizbaridch.entities;
import javax.persistence.*;

@Entity @Table(name = "user")
public class User  implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    @Column(name = "first_name",nullable = false,length = 75)
    private String firstName;
    @Column(name = "last_name",nullable = false,length = 75)
    private String lastName;
    @Column(name = "email",nullable = false,length = 150,unique = true)
    private String email;
    @Column(name = "password",nullable = false,length = 75)
    private String password;
    @ManyToOne
    @JoinColumn(name = "role_id_role",unique = false)
    private Role role;
    @ManyToOne
    @JoinColumn(name = "address_id_address",unique = false)
    private Address address;

    public Address getAddress() {
        return address;
    }

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

    public void setPassword(String password){
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
