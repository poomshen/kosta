package Team03_card_pleus;

public class Affiliate implements Card{
	//�� �� ����
	int totalmoney;
	//����Ʈ�� ������ ������(ī�带 ���� ���࿡ �����Ḧ �־�� �Ѵ�.) ������ 
	protected int totalpoint;
	//��ǰ -��.?
	static Merchandise [] Merch = new Merchandise[1];
	
	//���� �޴� �޼ҵ�
	@Override
	public void getmoney(int money) {
		this.totalmoney += money;
	}
	//����Ʈ���޴¸޼ҵ�
	@Override
	public void getpoint(int point) {
		this.totalpoint += point;
	}
	//��ǰ�� �޴� �޼ҵ�
	public void getMerch(Merchandise m , int su){
		this.Merch[su] = m;
	}
	
}
