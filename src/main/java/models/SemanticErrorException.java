package models;

public class SemanticErrorException extends RuntimeException {

    public SemanticErrorException(String message) {
        super(message, null, true, false);
    }

    @Override
    public String toString() {
        return getLocalizedMessage();
    }
}
