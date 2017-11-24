package uk.ac.rhul.cs.dice.agent.exceptions;

import uk.ac.rhul.cs.dice.agent.interfaces.Avatar;

/**
 * 
 * This {@link RuntimeException} sub-class is for failed {@link Avatar} communication with its principal.
 * 
 * @author cloudstrife9999
 *
 */
public class AvatarCommunicationException extends RuntimeException {
    private static final long serialVersionUID = -4304632577675178009L;

    /**
     * 
     * Calls the super() constructor.
     * 
     */
    public AvatarCommunicationException() {
	super();
    }

    /**
     * 
     * Calls the super(message) constructor.
     * 
     * @param message a {@link String} message.
     * 
     */
    public AvatarCommunicationException(String message) {
	super(message);
    }

    /**
     * 
     * Calls the super(cause) constructor.
     * 
     * @param cause a {@link Throwable} which caused this {@link AvatarCommunicationException}.
     * 
     */
    public AvatarCommunicationException(Throwable cause) {
	super(cause);
    }

    /**
     * 
     * Calls the super(message, cause) constructor.
     * 
     * @param message a {@link String} message.
     * @param cause a {@link Throwable} which caused this {@link AvatarCommunicationException}.
     * 
     */
    public AvatarCommunicationException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * 
     * Calls the super(message, cause, enableSuppression, writableStackTrace) constructor.
     * 
     * @param message a {@link String} message.
     * @param cause a {@link Throwable} which caused this {@link AvatarCommunicationException}.
     * @param enableSuppression a boolean flag which tells whether or not to enable the suppression.
     * @param writableStackTrace a boolean flag which tells whether or not the stack trace should be writable.
     * 
     */
    public AvatarCommunicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }
}