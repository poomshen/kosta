package Team03_card;

//�ĸ��ٰ�Ʈ
public class Paris extends Happycard implements PayBack {
	public Paris() {
	}
	
	@Override
	public void Buy(int money) {
		Payback(money);
		super.money += money;
		super.point += money*10/100;
	}
	@Override
	public void Payback(int money) {
		super.point += money/PAYBACK;
		System.out.println("���̹��� :" +money/PAYBACK +"��ŭ �Ǿ����ϴ�.");
	}
	@Override
	public String toString() {
		return "�ĸ��ٰ�Ʈ";
	}
}
