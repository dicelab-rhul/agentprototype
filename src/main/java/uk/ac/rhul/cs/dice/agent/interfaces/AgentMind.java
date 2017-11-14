package uk.ac.rhul.cs.dice.agent.interfaces;

import java.util.Random;

import uk.ac.rhul.cs.dice.agent.abstractimpl.AbstractAgentMind;

/**
 * 
 * An interface for {@link Agent} {@link Mind}s. It extends {@link Mind}.<br /><br />
 * 
 * Known implementations: {@link AbstractAgentMind}.
 * 
 * @author cloudstrife9999
 *
 */
public interface AgentMind extends Mind {
    
    /**
     * 
     * Returns whether the owner of this {@link AgentMind} is an {@link Agent}.
     * 
     * @return whether or not the owner of this {@link AgentMind} is an {@link Agent}.
     * 
     */
    public abstract boolean isAgent();
    
    /**
     * 
     * Returns a {@link Random} generator.
     * 
     * @return a {@link Random} generator.
     * 
     */
    public abstract Random getRng();
}