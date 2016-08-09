package Team03_card;

public class Okcard extends Card{
	public Okcard() {
	}
	@Override
	public void Buy(int money) {
		super.money += money;
		super.Buy(money);
	}
}
