package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.ArrayList;
import java.util.List;

import uk.ac.rhul.cs.dice.agent.interfaces.Analyzable;
import uk.ac.rhul.cs.dice.agent.interfaces.Mind;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

public abstract class AbstractMind implements Mind {
    private List<Analyzable> defaultLastReceivedPerceptions;
    private Action<?> decidedAction;
    
    public AbstractMind() {
	this.defaultLastReceivedPerceptions = new ArrayList<>();
    }
    
    protected List<Analyzable> getDefaultLastReceivedPerceptions() {
	return this.defaultLastReceivedPerceptions;
    }
    
    @Override
    public void perceive(List<Analyzable> perceptions) {
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