package io.github.pablitohaddad.footballfromscratch.exceptions;

//custom exception

public class TeamNotFoundException extends RuntimeException{

    public TeamNotFoundException() {
        super("Team not found");
    }

    public TeamNotFoundException(String message) {super(message);}

}
