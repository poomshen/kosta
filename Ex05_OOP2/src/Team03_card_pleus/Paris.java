package Team03_card_pleus;

//�ĸ��ٰ�Ʈ
public class Paris extends Affiliate implements Happycard ,PayBack{
	Merchandise bread1 = new Merchandise("ũ�οͻ�",1000,10);
	Merchandise bread2 = new Merchandise("�Ļ�",1500,10);
	Merchandise bread3 = new Merchandise("����Ʈ",2000,10);
	Merchandise milk = new Merchandise("����",1000,10);

	@Override
	public void Payback(Merchandise m) {
		super.totalpoint += m.merchPay/PAYBACK;
		System.out.println("���̹��� :" +m.merchPay/PAYBACK +"��ŭ �Ǿ����ϴ�.");
	}

	@Override
	public void happyBuy(Merchandise m) {
		Payback(m);
		super.totalmoney += m.merchPay;
		super.totalpoint += m.merchPay*10/100;
	}
	@Override
	public String toString() {
		return "�ĸ��ٰ�Ʈ";
	}
}
