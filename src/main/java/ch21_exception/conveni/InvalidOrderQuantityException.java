package ch21_exception.conveni;

public class InvalidOrderQuantityException extends Exception {
    public InvalidOrderQuantityException(String message) {
        super(message);
    }
}
