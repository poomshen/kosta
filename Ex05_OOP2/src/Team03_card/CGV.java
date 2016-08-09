package Team03_card;

public class CGV extends Happycard {
	public CGV() {
	}
	@Override
	public void Buy(int money) {
		super.money += money;
		super.point += money*15/100;
	}
	@Override
	public String toString() {
		return "CGV";
	}
}
