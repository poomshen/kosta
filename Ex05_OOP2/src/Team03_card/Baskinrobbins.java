package Team03_card;

public class Baskinrobbins extends Happycard implements PayBack{
	
	public Baskinrobbins() {
	}

	@Override
	public void Payback(int money) {
		super.point += money/PAYBACK;
		System.out.println("페이백이 :" +money/PAYBACK +"만큼 되었습니다.");
	}
	@Override
	public void Buy(int money) {
		Payback(money);
		super.money += money;
		super.point += money*5/100;
		System.out.println(super.point);
	}
	@Override
	public String toString() {
		return "베스킨라벤스";
	}
}
