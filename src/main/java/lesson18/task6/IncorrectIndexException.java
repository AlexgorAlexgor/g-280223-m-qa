package lesson18.task6;

public class IncorrectIndexException extends Exception {
    public IncorrectIndexException(String message) {
        super(message);
    }

    public IncorrectIndexException(String message, Throwable cause) {
        super(message, cause);
    }
}