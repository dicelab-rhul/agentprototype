package uk.ac.rhul.cs.dice.agent.interfaces;

public interface GenericPrologMind<T> extends AgentMind {
    
    public abstract T getInterpreter();
    
    public abstract void setInterpreter(T interpreter);
}