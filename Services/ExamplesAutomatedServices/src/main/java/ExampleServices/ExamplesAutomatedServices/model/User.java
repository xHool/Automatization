package ExampleServices.ExamplesAutomatedServices.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
//import jakarta.validation.constraints.Size;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "firtsname")
    private String firtsname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    public User() {
    }
}
