package io.github.pablitohaddad.footballfromscratch.model.entity;

import io.github.pablitohaddad.footballfromscratch.model.entity.enums.Position;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid", updatable = false, nullable = false)
    private String uuid;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING) // o banco de dados vai salvar uma string da posição
    @Column(name = "position", nullable = false)
    private Position position;

    @Column(name = "nationality", length = 20)
    private String nationality;
}
