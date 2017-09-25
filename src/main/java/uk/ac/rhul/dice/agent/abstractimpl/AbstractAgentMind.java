package uk.ac.rhul.dice.agent.abstractimpl;

import uk.ac.rhul.dice.agent.interfaces.AgentMind;

public abstract class AbstractAgentMind implements AgentMind {
    private final boolean isAgent;
    
    public AbstractAgentMind() {
	this.isAgent = true;
    }
    
    public boolean isAgent() {
	return this.isAgent;
    }
}