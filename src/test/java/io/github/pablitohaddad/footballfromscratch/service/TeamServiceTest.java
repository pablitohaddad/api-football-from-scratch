package io.github.pablitohaddad.footballfromscratch.service;

import io.github.pablitohaddad.footballfromscratch.repository.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class TeamServiceTest {

    @InjectMocks
    TeamService teamService;

    @Mock
    PlayerRepository playerRepository;


    @Test
    void createTeam_WithValidData_ReturnsTeamResponseDTO() {



    }
}