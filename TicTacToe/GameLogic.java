import java.util.Scanner;

public class GameLogic {
    private Scanner prompt;
    private GameBoard board;
    private PlayerManagement playerManagement;

    public GameLogic(Scanner prompt, GameBoard board, PlayerManagement playerManagement) {
        this.prompt = prompt;
        this.board = board;
        this.playerManagement = playerManagement;
    }

    public void nextField() {
        System.out.println("Bitte wähle ein Feld [1-9]:");
        Integer fieldIndex = this.prompt.nextInt();

        this.board.setField(
            fieldIndex,
            this.playerManagement.getNextPlayer()
        );
    }

    public boolean hasWon() {
        return false;
    }
}
