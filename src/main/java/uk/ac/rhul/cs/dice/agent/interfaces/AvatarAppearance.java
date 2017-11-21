package uk.ac.rhul.cs.dice.agent.interfaces;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Appearance;

/**
 * 
 * An interface for appearances of {@link Avatar}s. It extends {@link Appearance}.
 * 
 * @author cloudstrife9999
 *
 */
public interface AvatarAppearance extends ActorAppearance {
    
    /**
     * 
     * Returns the port the corresponding {@link Avatar} is listening on.
     * 
     * @return the port the corresponding {@link Avatar} is listening on.
     * 
     */
    public abstract int getListeningPort();
}