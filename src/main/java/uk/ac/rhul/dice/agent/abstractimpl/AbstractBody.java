package uk.ac.rhul.dice.agent.abstractimpl;

import uk.ac.rhul.dice.agent.interfaces.Body;

public abstract class AbstractBody implements Body {
    private String id;
    
    public AbstractBody(String id) {
	this.id = id;
    }

    public String getID() {
	return this.id;
    }
}