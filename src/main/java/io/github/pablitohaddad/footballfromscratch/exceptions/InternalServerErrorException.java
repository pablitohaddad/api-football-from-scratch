package io.github.pablitohaddad.footballfromscratch.exceptions;

public class InternalServerErrorException extends  RuntimeException{

    public InternalServerErrorException(){
        super("Team not found");
    }
    public InternalServerErrorException(String message) {super(message);}


}
