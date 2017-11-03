package uk.ac.rhul.cs.dice.agent.interfaces;

import java.util.Random;

public interface AgentMind extends Mind {
    public abstract boolean isAgent();
    public abstract Random getRng();
}