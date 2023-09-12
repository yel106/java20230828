package ch11exception.book.exam07;

public class InsufficientException extends Exception {
    public InsufficientException() {

    }

    public InsufficientException(String message) {
        super(message);
    }
}
