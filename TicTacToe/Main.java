import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner prompt = new Scanner(System.in);
		GameBoard board = new GameBoard();
		GameLogic logic = new GameLogic(prompt, board);

		Game game = new Game(board, logic);
		game.welcome();
	}
}
