package Team03_card_pleus;

public class Baskinrobbins extends Affiliate implements Happycard , PayBack{
	//���̽�ũ�� ��
	Merchandise smallIce = new Merchandise("���̽�ũ��_��",1000,20);
	//���̽�ũ�� ��
	Merchandise mediumIce = new Merchandise("���̽�ũ��_��",2000,20);
	//���̽�ũ�� ��
	Merchandise largeIce = new Merchandise("���̽�ũ��_��",3500,20);
	
	///���ǸӴ�ī�忡 �ۼ�Ʈ �ֱ�
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
		System.out.println("���̹��� :" +m.merchPay/PAYBACK +"��ŭ �Ǿ����ϴ�.");
	}
	@Override
	public String toString() {
		return "����Ų�󺥽�";
	}
	
}
