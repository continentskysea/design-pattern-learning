package mediator.component;
import mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
