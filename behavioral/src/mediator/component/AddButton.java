package mediator.component;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import mediator.mediator.Mediator;
import mediator.mediator.Note;

public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }
    
    @Override
    public String getName() {
        return "AddButton";
    }
}
