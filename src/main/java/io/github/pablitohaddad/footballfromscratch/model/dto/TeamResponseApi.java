package io.github.pablitohaddad.footballfromscratch.model.dto;

import io.github.pablitohaddad.footballfromscratch.model.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeamResponseApi {
    private List<Team> teams;
}
