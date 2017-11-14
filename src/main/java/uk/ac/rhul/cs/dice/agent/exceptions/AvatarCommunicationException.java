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
     * Calls the super() constructor.
     * 
     */
    public AvatarCommunicationException(String message) {
	super(message);
    }

    /**
     * 
     * Calls the super(cause) constructor.
     * 
     */
    public AvatarCommunicationException(Throwable cause) {
	super(cause);
    }

    /**
     * 
     * Calls the super(message, cause) constructor.
     * 
     */
    public AvatarCommunicationException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * 
     * Calls the super(message, cause, enableSuppression, writableStackTrace) constructor.
     * 
     */
    public AvatarCommunicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }
}