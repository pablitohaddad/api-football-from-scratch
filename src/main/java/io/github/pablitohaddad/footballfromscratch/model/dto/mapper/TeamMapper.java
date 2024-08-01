package io.github.pablitohaddad.footballfromscratch.model.dto.mapper;

import io.github.pablitohaddad.footballfromscratch.model.dto.TeamCreateDTO;
import io.github.pablitohaddad.footballfromscratch.model.dto.TeamResponseDTO;
import io.github.pablitohaddad.footballfromscratch.model.entity.Team;
import org.modelmapper.ModelMapper;

public class TeamMapper {

    public static TeamResponseDTO toDTO(Team team){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(team, TeamResponseDTO.class);
    }

    public static Team toTeam(TeamCreateDTO createDTO){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(createDTO, Team.class);
    }
}
