package uk.ac.rhul.cs.dice.agent.abstractimpl;

import uk.ac.rhul.cs.dice.agent.interfaces.Body;

public abstract class AbstractBody implements Body {
    private String id;
    
    public AbstractBody(String id) {
	this.id = id;
    }

    @Override
    public String getID() {
	return this.id;
    }
}