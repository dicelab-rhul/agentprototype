package uk.ac.rhul.cs.dice.agent.abstractimpl;

import uk.ac.rhul.cs.dice.agent.interfaces.Body;

/**
 * 
 * Abstract implementation of {@link Body}. It has a {@link String} ID.<br /><br />
 * 
 * Known sub-classes: {@link AbstractActiveBody}.
 * 
 * @author cloudstrife9999
 *
 */
public abstract class AbstractBody implements Body {
    private String id;
    
    /**
     * 
     * Empty constructor for serialization.
     * 
     */
    public AbstractBody() {
	//for serialization
    }
    
    /**
     * 
     * Constructs an {@link AbstractBody} from a {@link String} ID.
     * 
     * @param id a {@link String} ID.
     * 
     */
    public AbstractBody(String id) {
	this.id = id;
    }

    @Override
    public String getID() {
	return this.id;
    }
}