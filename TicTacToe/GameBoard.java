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
}
