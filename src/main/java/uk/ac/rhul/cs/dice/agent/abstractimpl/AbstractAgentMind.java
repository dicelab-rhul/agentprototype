package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.Random;

import uk.ac.rhul.cs.dice.agent.interfaces.AgentMind;

/**
 * 
 * Abstract implementations of {@link AgentMind} which extends {@link AbstractMind}. It has a {@link Random} generator and a {@link Boolean} flag.
 * 
 * @author cloudstrife9999
 *
 */
public abstract class AbstractAgentMind extends AbstractMind implements AgentMind {
    private static final long serialVersionUID = 3274116335368565187L;
    private final boolean isAgent;
    private Random rng;
    
    /**
     * 
     * Creates an {@link AbstractMind} initializing the flag to <code>true</code> and also initializing the {@link Random} generator.
     * 
     */
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