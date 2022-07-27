import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bootstrap {
    public static void main(String[] args) {
        JTextField inputWordField = new JTextField();
        JTextField guessCharacterTextField = new JTextField();
        JLabel currentGuessedWordLabel = new JLabel("_ _ _ _");
        JButton setWordButton = new JButton("Set Word!");
        JButton guessButton = new JButton("Guess!");

        new HangmanWindow(guessCharacterTextField, currentGuessedWordLabel, guessButton);
        new InitialWordWindow(inputWordField, setWordButton);
    }
}
