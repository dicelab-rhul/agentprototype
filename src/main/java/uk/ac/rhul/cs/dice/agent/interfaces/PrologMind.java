package uk.ac.rhul.cs.dice.agent.interfaces;

import java.util.List;

import alice.tuprolog.Prolog;
import alice.tuprolog.Theory;

/**
 * 
 * This interface is for an {@link AgentMind} which uses Prolog in the decision process. It extends {@link GenericPrologMind}.
 * 
 * @author cloudstrife9999
 *
 */
public interface PrologMind extends GenericPrologMind<Prolog> {

    /**
     * 
     * Returns the {@link Prolog} interpreter.
     * 
     * @return the {@link Prolog} interpreter.
     * 
     */
    @Override
    public abstract Prolog getInterpreter();

    /**
     * 
     * Sets the {@link Prolog} interpreter.
     * 
     * @param interpreter the {@link Prolog} interpreter.
     * 
     */
    @Override
    public abstract void setInterpreter(Prolog interpreter);

    /**
     * 
     * Return all the {@link Theory} objects currently stored.
     * 
     * @return a {@link List} of the {@link Theory} objects currently stored.
     * 
     */
    public abstract List<Theory> getTheories();

    /**
     * 
     * Sets a {@link List} of {@link Theory} objects, overwriting any previous {@link Theory} currently stored.
     * 
     * @param theories a {@link List} of {@link Theory} objects.
     * 
     */
    public abstract void setTheories(List<Theory> theories);

    /**
     * 
     * Appends a {@link Theory} to the existing ones.
     * 
     * @param theory a {@link Theory}.
     * 
     */
    public default void addTheory(Theory theory) {
	getTheories().add(theory);
    }

    /**
     * 
     * Returns the first {@link Theory} of the {@link List}, if available.
     * 
     * @return the first {@link Theory} of the {@link List}, if available.
     * 
     */
    public default Theory getFirstTheory() {
	return getTheories().get(0);
    }
}