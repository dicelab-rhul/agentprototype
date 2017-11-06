package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.Random;

import uk.ac.rhul.cs.dice.agent.interfaces.AgentMind;

public abstract class AbstractAgentMind extends AbstractMind implements AgentMind {
    private static final long serialVersionUID = 3274116335368565187L;
    private final boolean isAgent;
    private Random rng;
    
    public AbstractAgentMind() {
	this.isAgent = true;
	this.rng = new Random();
    }
    
    @Override
    public boolean isAgent() {
	return this.isAgent;
    }
    
    @Override
    public Random getRng() {
	return this.rng;
    }
}