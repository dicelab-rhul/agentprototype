package uk.ac.rhul.dice.agent.abstractimpl;

import java.util.List;

import uk.ac.rhul.dice.agent.interfaces.Actuator;
import uk.ac.rhul.dice.agent.interfaces.Agent;
import uk.ac.rhul.dice.agent.interfaces.AgentMind;
import uk.ac.rhul.dice.agent.interfaces.Sensor;

public abstract class AbstractAgent extends AbstractActiveBody implements Agent, Runnable {
    private AgentMind mind;
    
    public AbstractAgent(String id, List<Sensor> sensors, List<Actuator> actuators, AgentMind mind) {
	super(id, sensors, actuators);
	
	this.mind = mind;
    }

    @Override
    public AgentMind getMind() {
        return this.mind;
    }
}