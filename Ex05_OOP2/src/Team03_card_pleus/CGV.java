package Team03_card_pleus;

public class CGV extends Affiliate implements Happycard{
	Merchandise movie1 = new Merchandise("�����", 5000);
	Merchandise movie2 = new Merchandise("��Ÿ����3D", 7000);

	@Override
	public void happyBuy(Merchandise m) {
		super.totalmoney += m.merchPay;
		super.totalpoint += m.merchPay*15/100;
	}
	@Override
	public String toString() {
		return "CGV";
	}
}
