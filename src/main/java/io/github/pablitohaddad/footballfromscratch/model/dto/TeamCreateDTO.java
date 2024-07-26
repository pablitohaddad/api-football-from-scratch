package io.github.pablitohaddad.footballfromscratch.model.dto;

import io.github.pablitohaddad.footballfromscratch.model.entity.Player;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
public class TeamCreateDTO {

    @NotBlank(message = "Name is mandatory") // não pode ser nem nulo, nem vazio
    private String name;

    @NotBlank(message = "Age is mandatory")
    private Integer age;

    @NotBlank(message = "City is mandatory")
    private String city;

    @NotBlank(message = "Country is mandatory")
    private String country;

    @NotBlank(message = "Stadium is mandatory")
    private String stadium;

    @NotBlank(message = "Foundation is mandatory")
    private LocalDate foundation;

    @Valid // Os jogadores tem que ser validos
    @Size(min = 1, message = "There must be at least one player in the list")
    @NotNull(message = "Players list cannot be null")
    private List<Player> players;

}
