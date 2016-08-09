package Team03_card_pleus;

public class Affiliate implements Card{
	//돈 총 매출
	int totalmoney;
	//포인트를 쓰던가 말던가(카드를 쓰면 은행에 수수료를 주어야 한다.) 수수료 
	protected int totalpoint;
	//상품 -들.?
	static Merchandise [] Merch = new Merchandise[1];
	
	//돈을 받는 메소드
	@Override
	public void getmoney(int money) {
		this.totalmoney += money;
	}
	//포인트를받는메소드
	@Override
	public void getpoint(int point) {
		this.totalpoint += point;
	}
	//상품을 받는 메소드
	public void getMerch(Merchandise m , int su){
		this.Merch[su] = m;
	}
	
}
