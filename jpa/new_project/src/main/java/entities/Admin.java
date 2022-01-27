package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
}
