package uk.ac.rhul.cs.dice.agent.interfaces;

public interface Agent extends ActiveBody {
    public abstract AgentMind getMind();
    public abstract void sendToMind(Analyzable analyzable);
    public abstract AgentAppearance getAppearance();
}