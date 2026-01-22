package tech.codehunt.test.exceptions;

public class DuplicateResourceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DuplicateResourceException() {
        super("DUPLICATE RESOURCE EXCEPTIONS ");
    }

    public DuplicateResourceException(String customMessage) {
        super(customMessage);
    }
}
