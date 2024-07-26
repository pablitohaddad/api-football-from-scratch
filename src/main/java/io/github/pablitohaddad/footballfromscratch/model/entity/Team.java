package io.github.pablitohaddad.footballfromscratch.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid", updatable = false, nullable = false)
    private String uuid;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "country", length = 50)
    private String country;

    @Column(name = "stadium", length = 20)
    private String stadium;

    @Column(name = "foundation")
    private LocalDate foundation;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL) // Relação de Team para Player
    @JoinColumn(name = "team_id") // Adiciona a coluna de chave estrangeira na tabela Player
    private List<Player> players;
}
