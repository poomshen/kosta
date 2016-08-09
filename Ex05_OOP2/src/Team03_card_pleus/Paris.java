package Team03_card_pleus;

//파리바게트
public class Paris extends Affiliate implements Happycard ,PayBack{
	Merchandise bread1 = new Merchandise("크로와상",1000,10);
	Merchandise bread2 = new Merchandise("식빵",1500,10);
	Merchandise bread3 = new Merchandise("빠게트",2000,10);
	Merchandise milk = new Merchandise("우유",1000,10);

	@Override
	public void Payback(Merchandise m) {
		super.totalpoint += m.merchPay/PAYBACK;
		System.out.println("페이백이 :" +m.merchPay/PAYBACK +"만큼 되었습니다.");
	}

	@Override
	public void happyBuy(Merchandise m) {
		Payback(m);
		super.totalmoney += m.merchPay;
		super.totalpoint += m.merchPay*10/100;
	}
	@Override
	public String toString() {
		return "파리바게트";
	}
}
