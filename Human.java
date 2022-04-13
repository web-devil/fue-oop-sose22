public class Human {
    public String name;

    public void gehen() {
        System.out.println(this.name + " geht 5 Schritte.");
    }

    public String schreien() {
        return "AAAAAAAAAH";
    }

    public Human gebären(String name) {
        Human baby = new Human();
        baby.name = name;

        return baby;
    }
}
