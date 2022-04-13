public class Rockets {
    public void print() {
        cone();
		box();
		middle();
		box();
		cone();
    }

    private void middle() {
		System.out.println("|Rocket| |Rocket|");
		System.out.println("|  #1  | |  #2  |");
	}
	
	private void box() {
		System.out.println("+------+ +------+");
		System.out.println("|      | |      |");
		System.out.println("+------+ +------+");
	}
	
	private void cone() {
		System.out.println("   /\\       /\\");
		System.out.println("  /  \\     /  \\");
	 	System.out.println(" /    \\   /    \\");
	}
}
