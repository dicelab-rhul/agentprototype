package uk.ac.rhul.cs.dice.agent.interfaces;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Actor;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Appearance;

/**
 * 
 * An interface for appearances of {@link Actor}s. It extends {@link Appearance}.
 * 
 * @author cloudstrife9999
 *
 */
public interface ActorAppearance extends Appearance {
    
    /**
     * 
     * Returns the {@link String} id of the {@link Actor}.
     * 
     * @return the {@link String} id of the {@link Actor}.
     * 
     */
    public abstract String getId();
    
    /**
     * 
     * Returns the {@link Appearance} of the {@link Mind} of this {@link Actor}.
     * 
     * @return the {@link Appearance} of the {@link Mind} of this {@link Actor}.
     * 
     */
    public Appearance getMindAppearance();
}