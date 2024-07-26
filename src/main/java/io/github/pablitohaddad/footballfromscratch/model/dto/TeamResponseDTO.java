package io.github.pablitohaddad.footballfromscratch.model.dto;

import io.github.pablitohaddad.footballfromscratch.model.entity.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeamResponseDTO {

    private String name;

    private Integer age;

    private String city;

    private String country;

    private String stadium;

    private LocalDate foundation;

    private List<Player> players;

}
