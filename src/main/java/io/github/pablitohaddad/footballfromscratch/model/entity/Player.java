package io.github.pablitohaddad.footballfromscratch.model.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "date_of_birth", nullable = false)
    private String dateOfBirth;

    @Column(name = "nationality", nullable = false)
    private String nationality;

    @ManyToOne
    @JoinColumn(name = "team_id") // Define a coluna de chave estrangeira
    private Team team;
}
