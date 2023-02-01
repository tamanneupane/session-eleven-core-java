package day24;

public class EmailNotValidException extends RuntimeException{

    public EmailNotValidException(String message){
        super(message);
    }
}
