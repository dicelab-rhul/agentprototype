package uk.ac.rhul.cs.dice.agent.interfaces;

import java.io.Serializable;

public interface PrincipalListener extends Mind, Serializable {
    public abstract boolean isActive();
    public abstract void activate();
    public abstract void deactivate();
}