package Team03_card_pleus;

public class User implements Card, Happycard ,Okcard ,PayBack {
	int money;
	static int happypoint;
	static int OKpoint;

	//물건을 샀을 때 받는 포인트
	@Override
	public void okBuy(Merchandise m) {
		this.OKpoint += m.merchPay;
	}

	//물건을 샀을 때 받는 포인트
	@Override
	public void happyBuy(Merchandise m) {
		this.happypoint += m.merchPay;
	}
	
	//돈 받기
	@Override
	public void getmoney(int money) {
		this.money = money;
	}

	//페이백 돈을 받는다.
	@Override
	public void getpoint(int point) {
		this.money = point;
	}

	@Override
	public void Payback(Merchandise m) {
		// TODO Auto-generated method stub
		
	}

}
