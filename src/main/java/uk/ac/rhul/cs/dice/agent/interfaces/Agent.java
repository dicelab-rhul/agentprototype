package uk.ac.rhul.cs.dice.agent.interfaces;

import java.util.Set;

public interface Agent extends ActiveBody {
    public abstract AgentMind getMind();
    public abstract void sendToMind();
    public abstract ActorAppearance getAppearance();
    public abstract Set<Analyzable> getForMind();
    public abstract void setForMind(Set<Analyzable> forMind);
    public abstract void appendForMind(Set<Analyzable> forMind);
    public abstract void appendForMind(Analyzable forMind);
}