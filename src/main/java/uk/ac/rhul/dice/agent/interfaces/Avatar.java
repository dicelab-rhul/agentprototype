package uk.ac.rhul.dice.agent.interfaces;

public interface Avatar extends ActiveBody {
    public abstract PrincipalListener getPrincipalListener();
    public abstract void sendFeedbackToPrincipal(Analyzable... feedback);
}