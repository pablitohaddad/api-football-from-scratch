package io.github.pablitohaddad.footballfromscratch.infra;

import io.github.pablitohaddad.footballfromscratch.exceptions.InternalServerErrorException;
import io.github.pablitohaddad.footballfromscratch.exceptions.SquadNotFoundException;
import io.github.pablitohaddad.footballfromscratch.exceptions.TeamNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(TeamNotFoundException.class)
    private ResponseEntity<String> teamNotFoundHandler(TeamNotFoundException ex) { //A string pode ser oq eu quiser, posso criar uma classe
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Team not found");
    }

    @ExceptionHandler(SquadNotFoundException.class)
    private ResponseEntity<String> squadNotFoundHandler(SquadNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Squad not found");
    }

    @ExceptionHandler(InternalServerErrorException.class)
    private ResponseEntity<String> internalServerErrorHandler(InternalServerErrorException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("The server is bad :( Try again later.");
    }

}
