package Team03_card_pleus;

public class User implements Card, Happycard ,Okcard ,PayBack {
	int money;
	static int happypoint;
	static int OKpoint;

	//������ ���� �� �޴� ����Ʈ
	@Override
	public void okBuy(Merchandise m) {
		this.OKpoint += m.merchPay;
	}

	//������ ���� �� �޴� ����Ʈ
	@Override
	public void happyBuy(Merchandise m) {
		this.happypoint += m.merchPay;
	}
	
	//�� �ޱ�
	@Override
	public void getmoney(int money) {
		this.money = money;
	}

	//���̹� ���� �޴´�.
	@Override
	public void getpoint(int point) {
		this.money = point;
	}

	@Override
	public void Payback(Merchandise m) {
		// TODO Auto-generated method stub
		
	}

}
