package uk.ac.rhul.cs.dice.agent.abstractimpl;

import java.util.List;

import uk.ac.rhul.cs.dice.agent.interfaces.Actuator;
import uk.ac.rhul.cs.dice.agent.interfaces.Avatar;
import uk.ac.rhul.cs.dice.agent.interfaces.AvatarAppearance;
import uk.ac.rhul.cs.dice.agent.interfaces.PrincipalListener;
import uk.ac.rhul.cs.dice.agent.interfaces.Sensor;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Actor;

/**
 * 
 * Abstract implementation of {@link Avatar} and {@link Actor} which extends {@link AbstractActiveBody}. It has a {@link PrincipalListener} and an {@link AvatarAppearance}.
 * 
 * @author cloudstrife9999
 *
 */
public abstract class AbstractAvatar extends AbstractActiveBody implements Avatar, Actor {
    private static final long serialVersionUID = -3209731325209092245L;
    private PrincipalListener principalListener;
    private AvatarAppearance appearance;
    
    /**
     * 
     * Creates an {@link AbstractAvatar} from a {@link String} id, an {@link AvatarAppearance}, a {@link List} of {@link Sensor}s, a {@link List} of {@link Actuator}s and a {@link PrincipalListener}.
     * 
     * @param id a {@link String} id.
     * @param appearance an {@link AvatarAppearance}.
     * @param sensors a {@link List} of {@link Sensor}s.
     * @param actuators a {@link List} of {@link Actuator}s.
     * @param principalListener a {@link PrincipalListener}.
     * 
     */
    public AbstractAvatar(String id, AvatarAppearance appearance, List<Sensor> sensors, List<Actuator> actuators, PrincipalListener principalListener) {
	super(id, sensors, actuators);
	
	this.appearance = appearance;
	this.principalListener = principalListener;
    }
    
    @Override
    public PrincipalListener getPrincipalListener() {
        return this.principalListener;
    }
    
    @Override
    public AvatarAppearance getAppearance() {
        return this.appearance;
    }
}