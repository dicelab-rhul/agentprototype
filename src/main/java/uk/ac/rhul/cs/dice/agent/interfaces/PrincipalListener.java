package uk.ac.rhul.cs.dice.agent.interfaces;

import java.io.Serializable;

/**
 * 
 * An interface for principal listeners for {@link Avatar}s. It extends {@link Mind} and {@link Serializable}.
 * 
 * @author cloudstrife9999
 *
 */
public interface PrincipalListener extends Mind, Serializable {
    
    /**
     * 
     * Checks whether the {@link Avatar} which owns this {@link PrincipalListener} is active or not.
     * 
     * @return whether the {@link Avatar} which owns this {@link PrincipalListener} is active or not.
     * 
     */
    public abstract boolean isActive();
    
    /**
     * 
     * Activates the {@link Avatar} which owns this {@link PrincipalListener}.
     * 
     */
    public abstract void activate();
    
    /**
     * 
     * Dectivates the {@link Avatar} which owns this {@link PrincipalListener}.
     * 
     */
    public abstract void deactivate();
}