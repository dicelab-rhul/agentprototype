package uk.ac.rhul.cs.dice.agent.interfaces;

import java.io.Serializable;
import java.util.Set;

import uk.ac.rhul.cs.dice.agent.abstractimpl.AbstractMind;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

/**
 * 
 * An interface for minds. It extends {@link Serializable}.<br /><br />
 * 
 * Known implementations: {@link AbstractMind}, {@link AgentMind}, {@link PrincipalListener}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Mind extends Serializable {
    
    /**
     * 
     * Perceives a {@link Set} of {@link Analyzable} perceptions.
     * 
     * @param perceptions of {@link Analyzable} perceptions.
     * 
     */
    public abstract void perceive(Set<Analyzable> perceptions);
    
    /**
     * 
     * Perceives a {@link Set} of {@link Analyzable} perceptions before starting a simulation.
     * 
     * @param perceptions of {@link Analyzable} perceptions.
     * 
     */
    public abstract void receiveFirstPerception(Set<Analyzable> perceptions);
    
    /**
     * 
     * Revises the internal state of the {@link Mind}.
     * 
     */
    public abstract void revise();
    
    /**
     * 
     * Reasons and decides something (the specific behavior is left to implementations of this interface.
     * 
     * @return the decided {@link Object}.
     * 
     */
    public abstract Object decide();
    
    /**
     * 
     * Executes the action passed as parameter.
     * 
     * @param action an action of type <code>T</code>.
     * 
     */
    public abstract <T extends Action<?>> void execute(T action);
    
    /**
     * 
     * Returns the name of this {@link Mind}.
     * 
     * @return the name of this {@link Mind}.
     * 
     */
    public default String getName() {
	return getClass().getName();
    }
}