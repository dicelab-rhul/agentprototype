package uk.ac.rhul.dice.agent.interfaces;

public interface Agent extends ActiveBody {
    public abstract AgentMind getMind();
    public abstract void sendToMind(Analyzable analyzable);
}