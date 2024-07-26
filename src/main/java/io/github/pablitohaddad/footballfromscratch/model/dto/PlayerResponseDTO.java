package io.github.pablitohaddad.footballfromscratch.model.dto;

import io.github.pablitohaddad.footballfromscratch.model.entity.enums.Position;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerResponseDTO {

    private String uuid;

    private String name;

    private Integer age;

    private LocalDate birthDate;

    private Position position;

    private String nationality;

}