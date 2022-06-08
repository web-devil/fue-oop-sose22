import java.util.Scanner;

public class GameLogic {
    private Scanner prompt;
    private GameBoard board;

    public GameLogic(Scanner prompt, GameBoard board) {
        this.prompt = prompt;
        this.board = board;
    }

    public void nextField() {
        System.out.println("Bitte wähle ein Feld [1-9]:");
        Integer fieldIndex = this.prompt.nextInt();
        this.board.setField(fieldIndex, "x");
    }

    public boolean hasWon() {
        return false;
    }
}
