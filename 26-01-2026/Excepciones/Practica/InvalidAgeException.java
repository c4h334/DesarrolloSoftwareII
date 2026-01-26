package Excepciones.Practica;

public class InvalidAgeException extends IllegalArgumentException {

    public InvalidAgeException(String description) {
        super(description);
    }

}
