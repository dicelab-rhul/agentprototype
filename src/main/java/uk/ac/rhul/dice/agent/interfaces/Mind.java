package uk.ac.rhul.dice.agent.interfaces;

public interface Mind {
    public abstract void perceive(Analyzable... perceptions);
    public abstract Action decide();
    public abstract void execute(Action action);
}