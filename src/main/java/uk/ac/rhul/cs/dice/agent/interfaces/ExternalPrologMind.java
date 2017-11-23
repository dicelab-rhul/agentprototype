package uk.ac.rhul.cs.dice.agent.interfaces;

public interface ExternalPrologMind extends GenericPrologMind<Process> {
    
    @Override
    public abstract Process getInterpreter();
    
    @Override
    public abstract void setInterpreter(Process interpreter);
}