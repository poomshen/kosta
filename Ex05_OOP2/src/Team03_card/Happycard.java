package Team03_card;

public class Happycard extends Card{
	public Happycard() {
	}
	@Override
	public void Buy(int money) {
		super.money += money;
		super.Buy(money);
	}
}
