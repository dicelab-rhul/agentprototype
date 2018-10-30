package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.Random;

import uk.ac.rhul.cs.dice.agent.interfaces.ActiveBody;
import uk.ac.rhul.cs.dice.agent.interfaces.AgentMind;

/**
 * 
 * Abstract implementations of {@link AgentMind} which extends {@link AbstractMind}. It has a {@link Random} generator, a {@link Boolean} flag and a {@link String} ID.
 * 
 * @author cloudstrife9999
 *
 */
public abstract class AbstractAgentMind extends AbstractMind implements AgentMind {
    private static final long serialVersionUID = 3274116335368565187L;
    private final boolean isAgent;
    private Random rng;
    private String bodyId;
    
    /**
     * 
     * Creates an {@link AbstractMind} initializing the flag to <code>true</code> and also initializing the {@link Random} generator. The body ID is initialized with <code>bodyId</code>.
     * 
     * @param bodyId the ID of the {@link ActiveBody} which owns this {@link AbstractAgentMind}.
     * 
     */
    public AbstractAgentMind(String bodyId) {
	this.isAgent = true;
	this.rng = new Random(System.nanoTime());
	this.bodyId = bodyId;
    }
    
    @Override
    public boolean isAgent() {
	return this.isAgent;
    }
    
    @Override
    public Random getRng() {
	return this.rng;
    }
    
    @Override
    public String getBodyId() {
	return this.bodyId;
    }
}