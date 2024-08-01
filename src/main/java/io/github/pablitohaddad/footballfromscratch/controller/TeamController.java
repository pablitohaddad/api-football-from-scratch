package io.github.pablitohaddad.footballfromscratch.controller;

import io.github.pablitohaddad.footballfromscratch.model.dto.TeamCreateDTO;
import io.github.pablitohaddad.footballfromscratch.model.dto.TeamResponseDTO;
import io.github.pablitohaddad.footballfromscratch.service.TeamService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Teams", description = "Contains all operations to register, edit, delete, view a team.")
@RestController
@RequestMapping("/teams")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;


    @Operation(summary = "Create a new team", description = "Feature to create a new team",
            responses = {
                @ApiResponse(responseCode = "201", description = "Resource created successfully",
                content = @Content(schema = @Schema(implementation = TeamResponseDTO.class))),
            })
    @PostMapping
    public ResponseEntity<TeamResponseDTO> createTeam(@RequestBody @Valid TeamCreateDTO teamCreateDTO) {
        TeamResponseDTO createdTeam = teamService.createTeam(teamCreateDTO);
        return new ResponseEntity<>(createdTeam, HttpStatus.CREATED);
    }
}
