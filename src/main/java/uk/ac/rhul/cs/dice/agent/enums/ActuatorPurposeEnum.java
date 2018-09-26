package uk.ac.rhul.cs.dice.agent.enums;

import uk.ac.rhul.cs.dice.agent.interfaces.Actuator;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

/**
 * 
 * This enumeration is for {@link Actuator} purposes.<br /><br />
 * 
 * <code>ACT_PHYSICALLY</code> is for executing physical {@link Action}s.<br />
 * <code>SPEAK</code> is for executing communicative {@link Action}s.<br />
 * <code>OTHER</code> is for executing other kinds of {@link Action}s.<br />
 * <code>UNKNOWN</code> is for any other use.
 * 
 * @author cloudstrife9999
 *
 */
public enum ActuatorPurposeEnum {
    ACT_PHYSICALLY, SPEAK, OTHER, UNKNOWN;
}