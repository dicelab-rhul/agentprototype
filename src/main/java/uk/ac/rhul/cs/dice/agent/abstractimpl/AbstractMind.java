package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.HashSet;
import java.util.Set;

import uk.ac.rhul.cs.dice.agent.interfaces.Analyzable;
import uk.ac.rhul.cs.dice.agent.interfaces.Mind;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

public abstract class AbstractMind implements Mind {
    private static final long serialVersionUID = -2225358056712329596L;
    private Set<Analyzable> defaultLastReceivedPerceptions;
    private Action<?> decidedAction;
    
    public AbstractMind() {
	this.defaultLastReceivedPerceptions = new HashSet<>();
    }
    
    protected Set<Analyzable> getDefaultLastReceivedPerceptions() {
	return this.defaultLastReceivedPerceptions;
    }
    
    @Override
    public void perceive(Set<Analyzable> perceptions) {
	this.defaultLastReceivedPerceptions.clear();
	this.decidedAction = null;
    }
    
    protected void setDecidedAction(Action<?> action) {
	this.decidedAction = action;
    }
    
    protected Object getDecidedAction() {
	return this.decidedAction;
    }
}