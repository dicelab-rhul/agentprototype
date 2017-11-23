package uk.ac.rhul.cs.dice.agent.interfaces;

/**
 * 
 * This interface is for an {@link AgentMind} which uses an external Prolog interpreter in the decision process. It extends {@link GenericPrologMind}. 
 * 
 * @author cloudstrife9999
 *
 */
public interface ExternalPrologMind extends GenericPrologMind<Process> {
    
    /**
     * 
     * Returns the {@link Process} of the Prolog interpreter.
     * 
     * @return the {@link Process} of the Prolog interpreter.
     * 
     */
    @Override
    public abstract Process getInterpreter();
    
    /**
     * 
     * Sets the {@link Process} of the Prolog interpreter.
     * 
     * @param interpreter the {@link Process} of the Prolog interpreter.
     * 
     */
    @Override
    public abstract void setInterpreter(Process interpreter);
}