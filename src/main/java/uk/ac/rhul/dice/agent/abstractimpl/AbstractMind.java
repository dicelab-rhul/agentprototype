package uk.ac.rhul.dice.agent.abstractimpl;

import java.util.ArrayList;
import java.util.List;

import uk.ac.rhul.dice.agent.interfaces.Action;
import uk.ac.rhul.dice.agent.interfaces.Analyzable;
import uk.ac.rhul.dice.agent.interfaces.Mind;

public abstract class AbstractMind implements Mind {
    private List<Analyzable> lastReceived;
    private Action decidedAction;
    
    public AbstractMind() {
	this.lastReceived = new ArrayList<>();
    }
    
    protected List<Analyzable> getLastReceived() {
	return this.lastReceived;
    }
    
    @Override
    public void perceive(Analyzable... perceptions) {
	this.lastReceived.clear();
	
        for(Analyzable perception : perceptions) {
            this.lastReceived.add(perception);
        }
    }
    
    protected void setDecidedAction(Action action) {
	this.decidedAction = action;
    }
    
    protected Action getDecidedAction() {
	return this.decidedAction;
    }
}