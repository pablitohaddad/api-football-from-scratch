package io.github.pablitohaddad.footballfromscratch.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeamCreateDTO {

    @NotBlank(message = "Team name is mandatory")
    private String name;

    @NotBlank(message = "Team foundation is mandatory")
    private String founded;

    @NotBlank(message = "Team venue is mandatory")
    private String venue;

}
