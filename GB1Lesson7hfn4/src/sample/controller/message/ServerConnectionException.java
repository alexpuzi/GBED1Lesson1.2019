package sample.controller.message;

public class ServerConnectionException extends RuntimeException {
    public ServerConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
