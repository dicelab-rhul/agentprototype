package uk.ac.rhul.cs.dice.agent.enums;

import uk.ac.rhul.cs.dice.agent.interfaces.Sensor;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

/**
 * 
 * This enumeration is for {@link Sensor} purposes.<br /><br />
 * 
 * <code>SEE</code> is for physical {@link Action}s results.<br />
 * <code>LISTEN</code> is for communicative {@link Action}s results.<br />
 * <code>OTHER</code> is for any other {@link Action} results.<br />
 * <code>UNKNOWN</code> is for any other use.
 * 
 * @author cloudstrife9999
 *
 */
public enum SensorPurposeEnum {
    SEE, LISTEN, OTHER, UNKNOWN;
}