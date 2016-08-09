package Team03_card_pleus;

public class Baskinrobbins extends Affiliate implements Happycard , PayBack{
	//아이스크림 소
	Merchandise smallIce = new Merchandise("아이스크림_소",1000,20);
	//아이스크림 중
	Merchandise mediumIce = new Merchandise("아이스크림_중",2000,20);
	//아이스크림 대
	Merchandise largeIce = new Merchandise("아이스크림_대",3500,20);
	
	///해피머니카드에 퍼센트 넣기
	@Override
	public void happyBuy(Merchandise m) {
		Payback(m);
		super.totalmoney += m.merchPay;
		super.totalpoint += m.merchPay*5/100;
		System.out.println(super.totalpoint);
	}
	//
	@Override
	public void Payback(Merchandise m) {
		super.totalpoint += m.merchPay/PAYBACK;
		System.out.println("페이백이 :" +m.merchPay/PAYBACK +"만큼 되었습니다.");
	}
	@Override
	public String toString() {
		return "베스킨라벤스";
	}
	
}
