package uk.ac.rhul.cs.dice.agent.interfaces;

import java.io.Serializable;
import java.util.Set;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

public interface Mind extends Serializable {
    public abstract void perceive(Set<Analyzable> perceptions);
    public abstract Object decide();
    public abstract <T extends Action<?>> void execute(T action);
    
    public default String getName() {
	return getClass().getName();
    }
}