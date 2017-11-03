package uk.ac.rhul.cs.dice.agent.interfaces;

import java.util.List;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

public interface Mind {
    public abstract void perceive(List<Analyzable> perceptions);
    public abstract Object decide();
    public abstract <T extends Action<?>> void execute(T action);
}