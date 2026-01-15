package ch21_exception.signup;

public class InvalidIdException extends Exception {
    public InvalidIdException(String message) {
        super(message);
    }
}
