package uk.ac.rhul.cs.dice.agent.interfaces;

import uk.ac.rhul.cs.dice.agent.abstractimpl.AbstractAvatar;

/**
 * 
 * An interface for avatars. It extends {@link ActiveBody}.<br /><br />
 * 
 * Known implementations: {@link AbstractAvatar}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Avatar extends ActiveBody {
    
    /**
     * 
     * Returns the {@link PrincipalListener}of this {@link Avatar}.
     * 
     * @return the {@link PrincipalListener}of this {@link Avatar}.
     * 
     */
    public abstract PrincipalListener getPrincipalListener();
    
    /**
     * 
     * Sends to the principal an array of {@link Analyzable}s.
     * 
     * @param feedback an array of {@link Analyzable}s.
     * 
     */
    public abstract void sendFeedbackToPrincipal(Analyzable... feedback);
    
    /**
     * 
     * Return this {@link Avatar} {@link AvatarAppearance}.
     * 
     * @return this {@link Avatar} {@link AvatarAppearance}.
     * 
     */
    public abstract AvatarAppearance getAppearance();
}