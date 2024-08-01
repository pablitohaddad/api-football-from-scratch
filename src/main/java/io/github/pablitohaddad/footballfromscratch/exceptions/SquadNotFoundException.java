package io.github.pablitohaddad.footballfromscratch.exceptions;

public class SquadNotFoundException extends RuntimeException {

    public SquadNotFoundException(){
        super("Team not found");
    }

    public SquadNotFoundException(String message) {super(message);}


}
