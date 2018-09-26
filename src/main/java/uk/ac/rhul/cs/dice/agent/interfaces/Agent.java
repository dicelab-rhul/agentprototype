package uk.ac.rhul.cs.dice.agent.interfaces;

import java.util.Set;

import uk.ac.rhul.cs.dice.agent.abstractimpl.AbstractAgent;

/**
 * 
 * An interface for agents. It extends {@link ActiveBody}.<br /><br />
 * 
 * Known implementations: {@link AbstractAgent}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Agent extends ActiveBody {
    
    /**
     * 
     * Returns the {@link AgentMind} of this {@link Agent}.
     * 
     * @return the {@link AgentMind} of this {@link Agent}.
     * 
     */
    public abstract AgentMind getMind();
    
    /**
     * 
     * Sends something to the {@link Mind}. The logic is left to the implementation of this interface.
     * 
     */
    public abstract void sendToMind();
    
    /**
     * 
     * Returns the {@link ActorAppearance} of this {@link Agent}.
     * 
     * @return the {@link ActorAppearance} of this {@link Agent}.
     * 
     */
    public abstract ActorAppearance getAppearance();
    
    /**
     * 
     * Returns a {@link Set} of {@link Analyzable}s which soon or later are to be delivered to the {@link Mind}.
     * 
     * @return a {@link Set} of {@link Analyzable}s.
     * 
     */
    public abstract Set<Analyzable> getForMind();
    
    /**
     * 
     * Stores a {@link Set} of {@link Analyzable}s which soon or later are to be delivered to the {@link Mind}.
     * 
     * @param forMind a {@link Set} of {@link Analyzable}s.
     * 
     */
    public abstract void setForMind(Set<Analyzable> forMind);
    
    /**
     * 
     * Appends a {@link Set} of {@link Analyzable}s which soon or later are to be delivered to the {@link Mind}.
     * 
     * @param forMind a {@link Set} of {@link Analyzable}s.
     * 
     */
    public abstract void appendForMind(Set<Analyzable> forMind);
    
    /**
     * 
     * Stores a single {@link Analyzable} which soon or later is to be delivered to the {@link Mind}.
     * 
     * @param forMind an {@link Analyzable}.
     * 
     */
    public abstract void appendForMind(Analyzable forMind);
}