package io.github.pablitohaddad.footballfromscratch;

import io.github.pablitohaddad.footballfromscratch.model.consumer.TeamConsumerFeign;
import io.github.pablitohaddad.footballfromscratch.model.dto.PlayerResponseApi;
import io.github.pablitohaddad.footballfromscratch.model.dto.TeamCreateDTO;
import io.github.pablitohaddad.footballfromscratch.model.dto.TeamResponseApi;
import io.github.pablitohaddad.footballfromscratch.model.dto.TeamResponseDTO;
import io.github.pablitohaddad.footballfromscratch.model.entity.Player;
import io.github.pablitohaddad.footballfromscratch.model.entity.Team;
import io.github.pablitohaddad.footballfromscratch.repository.PlayerRepository;
import io.github.pablitohaddad.footballfromscratch.repository.TeamRepository;
import io.github.pablitohaddad.footballfromscratch.service.TeamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TeamServiceTest {

    @Mock
    private TeamConsumerFeign apiClient;

    @InjectMocks
    private TeamService teamService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateTeam() {
        TeamResponseApi mockResponse = new TeamResponseApi();
        List<Team> mockTeams = new ArrayList<>();
        mockResponse.setTeams(mockTeams);

        apiClient.getTeamById()

        TeamCreateDTO newTeam = new TeamCreateDTO("SV Wehen Wiesbaden", "1902", "TestStadium");
        teamService.createTeam(newTeam);

        assertEquals(1, mockTeams.size());
        assertEquals("Team C", mockTeams.get(0).getName());
    }
}
