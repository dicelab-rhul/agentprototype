package uk.ac.rhul.cs.dice.agent.interfaces;

/**
 * 
 * This is a generic interface for minds which employ Prolog in the decision process. It extends {@link AgentMind}.<br /><br />
 * 
 * Known sub-interfaces: {@link PrologMind}, {@link ExternalPrologMind}.
 * 
 * @author cloudstrife9999
 *
 * @param <T> the type of the Prolog interpreter.
 * 
 */
public interface GenericPrologMind<T> extends AgentMind {
    
    /**
     * 
     * Returns the Prolog interpreter.
     * 
     * @return the Prolog interpreter.
     * 
     */
    public abstract T getInterpreter();
    
    /**
     * 
     * Sets the Prolog interpreter.
     * 
     * @param interpreter the Prolog interpreter to set.
     * 
     */
    public abstract void setInterpreter(T interpreter);
}