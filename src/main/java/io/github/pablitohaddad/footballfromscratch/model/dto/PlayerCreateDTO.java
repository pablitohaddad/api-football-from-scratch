package io.github.pablitohaddad.footballfromscratch.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.github.pablitohaddad.footballfromscratch.model.entity.enums.Position;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerCreateDTO {

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Age is mandatory")
    @Positive
    private Integer age;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    private Position position;

    @NotBlank(message = "Nationality is mandatory")
    private String nationality;

}
