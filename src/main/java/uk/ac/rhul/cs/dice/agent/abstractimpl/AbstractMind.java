package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.HashSet;
import java.util.Set;

import uk.ac.rhul.cs.dice.agent.interfaces.Analyzable;
import uk.ac.rhul.cs.dice.agent.interfaces.Mind;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

/**
 * 
 * An abstract implementation of {@link Mind}. It has a {@link Set} of {@link Analyzable}s and it stores a decided {@link Action}.<br /><br />
 * 
 * Known sub-classes: {@link AbstractAgentMind}.
 * 
 * @author cloudstrife9999
 *
 */
public abstract class AbstractMind implements Mind {
    private static final long serialVersionUID = -2225358056712329596L;
    private Set<Analyzable> defaultLastReceivedPerceptions;
    private Action<?> decidedAction;
    
    /**
     * 
     * Empty constructor.
     * 
     */
    public AbstractMind() {
	this.defaultLastReceivedPerceptions = new HashSet<>();
    }
    
    /**
     * 
     * Returns the default {@link Set} of {@link Analyzable}s perceptions received in the last cycle.
     * 
     * @return the default {@link Set} of {@link Analyzable}s perceptions received in the last cycle.
     * 
     */
    protected Set<Analyzable> getDefaultLastReceivedPerceptions() {
	return this.defaultLastReceivedPerceptions;
    }
    
    /**
     * 
     * Clears the {@link Set} of {@link Analyzable}s perceptions received in the last cycle, and sets the decided {@link Action} to <code>null</code>.
     * 
     */
    @Override
    public void perceive(Set<Analyzable> perceptions) {
	this.defaultLastReceivedPerceptions.clear();
	this.decidedAction = null;
    }
    
    /**
     * 
     * Sets the decided {@link Action}.
     * 
     * @param action an {@link Action}.
     * 
     */
    protected void setDecidedAction(Action<?> action) {
	this.decidedAction = action;
    }
    
    /**
     * 
     * Returns the decided action action as an {@link Object}.
     * 
     * @return the decided action action as an {@link Object}.
     * 
     */
    protected Object getDecidedAction() {
	return this.decidedAction;
    }
}