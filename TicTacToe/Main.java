import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		PlayerManagement playerManagement = new PlayerManagement();

		Scanner prompt = new Scanner(System.in);
		GameBoard board = new GameBoard();
		GameLogic logic = new GameLogic(prompt, board, playerManagement);

		Game game = new Game(board, logic);
		game.welcome();
	}
}
