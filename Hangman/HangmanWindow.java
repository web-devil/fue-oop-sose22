import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class HangmanWindow extends AbstractWindow {
    private JTextField guessCharacterTextField;
    private JLabel currentGuessedWordLabel;
    private JButton guessButton; 

    public HangmanWindow (JTextField guessCharacterTextField, JLabel currentGuessedWordLabel, JButton guessButton) {
        this.guessCharacterTextField = guessCharacterTextField;
        this.currentGuessedWordLabel = currentGuessedWordLabel;
        this.guessButton = guessButton;

        this.renderView(
            this.currentGuessedWordLabel,
            this.guessCharacterTextField,
            this.guessButton
        );
    }
}
