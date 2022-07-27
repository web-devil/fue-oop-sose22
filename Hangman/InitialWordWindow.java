import javax.swing.JButton;
import javax.swing.JTextField;

public class InitialWordWindow extends AbstractWindow {
    private JTextField inputWordField;
    private JButton setWordButton;

    public InitialWordWindow(JTextField inputWordField, JButton setWordButton) {
        this.inputWordField = inputWordField;
        this.setWordButton = setWordButton;

        this.renderView(this.inputWordField, this.setWordButton);
    }
}
