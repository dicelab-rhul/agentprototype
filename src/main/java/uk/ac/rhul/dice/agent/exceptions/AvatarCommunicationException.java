package uk.ac.rhul.dice.agent.exceptions;

public class AvatarCommunicationException extends RuntimeException {
    private static final long serialVersionUID = -4304632577675178009L;

    public AvatarCommunicationException() {}

    public AvatarCommunicationException(String message) {
	super(message);
    }

    public AvatarCommunicationException(Throwable cause) {
	super(cause);
    }

    public AvatarCommunicationException(String message, Throwable cause) {
	super(message, cause);
    }

    public AvatarCommunicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }
}