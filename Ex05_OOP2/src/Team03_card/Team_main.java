package Team03_card;

public class Team_main {
	public static void main(String[] args) {
		Paris pa = new Paris();
		CGV  cgv = new CGV();
		Baskinrobbins bask = new Baskinrobbins();
		bask.Buy(20000);
		bask.pint();
		System.out.println();
		pa.Buy(40000);
		pa.pint();
		System.out.println();
		cgv.Buy(30000);
		cgv.pint();
		
	}
}
