public class PlayerManagement {
    // ZUSTAND, engl state
    private String lastPlayer = "o"; 

    public String getNextPlayer() {
        if (this.lastPlayer.equals("x")) {
            this.lastPlayer = "o";
        } else {
            this.lastPlayer = "x";
        }

        return this.lastPlayer;
    }

    public String getCurrentPlayer() {
        return this.lastPlayer;
    }
}
