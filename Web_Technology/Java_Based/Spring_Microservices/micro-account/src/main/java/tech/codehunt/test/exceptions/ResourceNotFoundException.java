package tech.codehunt.test.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException() {
        super("RESOURCE NOT FOUND");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
