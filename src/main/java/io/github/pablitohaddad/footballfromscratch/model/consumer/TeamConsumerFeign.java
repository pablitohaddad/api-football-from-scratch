package io.github.pablitohaddad.footballfromscratch.model.consumer;

import io.github.pablitohaddad.footballfromscratch.config.FeignConfig;
import io.github.pablitohaddad.footballfromscratch.model.dto.TeamResponseApi;
import io.github.pablitohaddad.footballfromscratch.model.dto.PlayerResponseApi;
import io.github.pablitohaddad.footballfromscratch.model.entity.Team;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(value = "team-consumer",
        url = "http://api.football-data.org/v4/teams", configuration = FeignConfig.class)
public interface TeamConsumerFeign {

    @GetMapping()
    TeamResponseApi fetchAllTeams();

    @GetMapping("/{id}")
    Team fetchTeamById(@PathVariable("id") Integer id);

    @GetMapping("/{id}")
    PlayerResponseApi fetchSquadById(@PathVariable("id") Integer id);

}
