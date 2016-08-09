package Team03_card;

//파리바게트
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
		System.out.println("페이백이 :" +money/PAYBACK +"만큼 되었습니다.");
	}
	@Override
	public String toString() {
		return "파리바게트";
	}
}
