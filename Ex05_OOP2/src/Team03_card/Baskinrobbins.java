package Team03_card;

public class Baskinrobbins extends Happycard implements PayBack{
	
	public Baskinrobbins() {
	}

	@Override
	public void Payback(int money) {
		super.point += money/PAYBACK;
		System.out.println("���̹��� :" +money/PAYBACK +"��ŭ �Ǿ����ϴ�.");
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
		return "����Ų�󺥽�";
	}
}
