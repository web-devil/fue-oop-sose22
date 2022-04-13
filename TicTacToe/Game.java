public class Game {
    private GameBoard board;
    private GameLogic logic;

    public Game(GameBoard board, GameLogic logic) {
        this.board = board;
        this.logic = logic;
    }

    public void welcome() {
        System.out.println();
        System.out.println("Willkommen bei Tic Tac Toe!");
        System.out.println();

        this.play();
    }

    private void play() {
        this.board.print();
        this.logic.nextField();
    }
}
