package uk.ac.rhul.cs.dice.agent.interfaces;

public interface PrincipalListener extends Mind {
    public abstract boolean isActive();
    public abstract void activate();
    public abstract void deactivate();
}