package uk.ac.rhul.cs.dice.agent.interfaces;

import uk.ac.rhul.cs.dice.agent.abstractimpl.AbstractBody;

/**
 * 
 * An interface for bodies.<br /><br />
 * 
 * Known implementations: {@link AbstractBody}.
 * 
 * @author cloudstrife9999
 *
 */
@FunctionalInterface
public interface Body {
    
    /**
     * 
     * Returns the {@link String} ID of this {@link Body}.
     * 
     * @return the {@link String} ID of this {@link Body}.
     * 
     */
    public abstract String getID();
}