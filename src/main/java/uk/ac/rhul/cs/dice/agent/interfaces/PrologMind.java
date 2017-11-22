package uk.ac.rhul.cs.dice.agent.interfaces;

import java.util.List;

import alice.tuprolog.Prolog;
import alice.tuprolog.Theory;

public interface PrologMind extends AgentMind {

	public abstract Prolog getInterpreter();

	public abstract void setInterpreter(Prolog interpreter);

	public abstract List<Theory> getTheories();
	
	public abstract void setTheories(List<Theory> theories);

	public default void addTheory(Theory theory) {
		getTheories().add(theory);
	}
	
	public default Theory getFirstTheory() {
		return getTheories().get(0);
	}
}