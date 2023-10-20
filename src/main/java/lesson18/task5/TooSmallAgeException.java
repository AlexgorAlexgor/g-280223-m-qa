package lesson18.task5;

public class TooSmallAgeException extends RuntimeException {
    public TooSmallAgeException(String message) {
        super(message);
    }
}