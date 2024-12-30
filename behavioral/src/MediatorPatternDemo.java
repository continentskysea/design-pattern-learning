import javax.swing.DefaultListModel;

import mediator.component.AddButton;
import mediator.component.DeleteButton;
import mediator.component.Filter;
import mediator.component.List;
import mediator.component.SaveButton;
import mediator.component.TextBox;
import mediator.component.Title;
import mediator.mediator.Editor;
import mediator.mediator.Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel<>()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
