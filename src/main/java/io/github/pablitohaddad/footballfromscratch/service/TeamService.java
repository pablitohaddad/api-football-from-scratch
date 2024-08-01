package io.github.pablitohaddad.footballfromscratch.service;

import io.github.pablitohaddad.footballfromscratch.exceptions.InternalServerErrorException;
import io.github.pablitohaddad.footballfromscratch.exceptions.SquadNotFoundException;
import io.github.pablitohaddad.footballfromscratch.exceptions.TeamNotFoundException;
import io.github.pablitohaddad.footballfromscratch.model.consumer.TeamConsumerFeign;
import io.github.pablitohaddad.footballfromscratch.model.dto.TeamResponseApi;
import io.github.pablitohaddad.footballfromscratch.model.dto.TeamCreateDTO;
import io.github.pablitohaddad.footballfromscratch.model.dto.TeamResponseDTO;
import io.github.pablitohaddad.footballfromscratch.model.dto.mapper.TeamMapper;
import io.github.pablitohaddad.footballfromscratch.model.entity.Player;
import io.github.pablitohaddad.footballfromscratch.model.entity.Team;
import io.github.pablitohaddad.footballfromscratch.repository.PlayerRepository;
import io.github.pablitohaddad.footballfromscratch.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    private final PlayerRepository playerRepository;

    private final TeamConsumerFeign teamConsumerFeign;


    public TeamResponseDTO createTeam(TeamCreateDTO team) {

        try {
            Team foundTeam = findTeamByName(team.getName());
            List<Player> squad = teamConsumerFeign.fetchSquadById(foundTeam.getId()).getSquad();
            if (!squad.isEmpty()) {
                throw new SquadNotFoundException("Squad is empty");
            }
            foundTeam.setId(foundTeam.getId());
            foundTeam.setSquad(squad);

            playerRepository.saveAll(foundTeam.getSquad());
            teamRepository.save(foundTeam);
            return TeamMapper.toDTO(foundTeam);
        }catch (InternalServerErrorException ex){
            throw new InternalServerErrorException(ex.getMessage());
        }
    }
    public Team findTeamByName(String teamName) {
        List<Team> teams = fetchAllTeams();
        Team team = teams.stream()
                .filter(t -> t.getName().equalsIgnoreCase(teamName)) // filtro para encontrar exatamente o time que queremos pelo nome
                .findFirst()
                .orElseThrow(() -> new TeamNotFoundException("Team not found"));
        return fetchTeamById(team.getId());
    }

    public List<Team> fetchAllTeams() {
        TeamResponseApi response = teamConsumerFeign.fetchAllTeams();
        return response.getTeams();
    }
    private Team fetchTeamById(Integer teamId) {
        return teamConsumerFeign.fetchTeamById(teamId);
    }
}
