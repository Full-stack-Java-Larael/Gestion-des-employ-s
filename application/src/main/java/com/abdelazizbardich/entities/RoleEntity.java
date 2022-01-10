package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "role")
public class RoleEntity {
    @Id
    @Column(name = "id_role", nullable = false)
    private Long id_role;

    @Column(name = "name")
    private String name;
}
