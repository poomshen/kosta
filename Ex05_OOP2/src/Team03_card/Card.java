package Team03_card;

public class Card {
//����Ʈī�忡�� ���ݾװ� ���ݾ׿� ���� ����Ʈ�� �ִ�.
	int money;
	static int point;
	//������
	public Card() {
	}
	//���Ž�
	public void Buy(int money){
		this.money += money;
		this.point += money*10/100;
	}
	public void pint(){
		System.out.println("�̰�"+toString()+"���� �� "+this.money+" ��ŭ �Һ��ϼ̽��ϴ�.");
		System.out.println("����Ʈ�� ��"+this.point+"��ŭ ���� �Ǿ����ϴ�.");
	}
}
