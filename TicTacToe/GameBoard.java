import java.util.ArrayList;

class GameBoard {
    private ArrayList<String> fields = new ArrayList<String>();

    public GameBoard() {
        this.createFields();
    }

    private void createFields() {
        for (int i = 1; i <= 10; i++) {
            this.fields.add(" ");
        }
    }

    public void print() {
        // format
        System.out.printf(" %s | %s | %s ", this.fields.get(1), this.fields.get(2), this.fields.get(3));
        System.out.println();
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s ", this.fields.get(4), this.fields.get(5), this.fields.get(6));
        System.out.println();
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s ", this.fields.get(7), this.fields.get(8), this.fields.get(9));
        System.out.println();
        System.out.println();
    }

    public void setField(Integer fieldIndex, String player) {
        this.fields.set(fieldIndex, player);
    }

    public boolean hasWinningStrike(String player) {
        return (
            // horizontal
               (this.fields.get(1) == player && this.fields.get(2) == player && this.fields.get(3) == player)
            || (this.fields.get(4) == player && this.fields.get(5) == player && this.fields.get(6) == player)
            || (this.fields.get(7) == player && this.fields.get(8) == player && this.fields.get(9) == player)
            // vertikal
            || (this.fields.get(1) == player && this.fields.get(4) == player && this.fields.get(7) == player)
            || (this.fields.get(2) == player && this.fields.get(5) == player && this.fields.get(8) == player)
            || (this.fields.get(3) == player && this.fields.get(6) == player && this.fields.get(9) == player)
            // diagonal
            || (this.fields.get(1) == player && this.fields.get(5) == player && this.fields.get(9) == player)
            || (this.fields.get(3) == player && this.fields.get(5) == player && this.fields.get(7) == player)
        );
    }
}
