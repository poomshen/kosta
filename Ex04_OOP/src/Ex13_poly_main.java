//�ó�����
//����� ������ǰ ���� �ַ�� ���� ����� �Դϴ�.
// A ��� �ϴ� ������ǰ ������ ���� �Ǹ�
//�䱸���� 
//������ǰ ���� ������:��ǰ�� ��������, ��ǰ�� ����Ʈ ����
//�� ����  ��ǰ�� ��ǰ�� Ư¡�� ������ �ִ�.(��ǰ �̸� : Tv , Audio, computer)
//�� ��ǰ���� ������ �ٸ��� , ����Ʈ 10%
//Tv 100���� (����Ʈ 10����)

//������ :��ǰ�� ���� �ϱ� ���� �ݾ� ���� , ����Ʈ ������ ������ �ִ�.
//�����ڴ� ���� ������ �Ҽ� �ִ�.(������ǰ)
//������ �ϰ� �Ǹ� �����ڰ� ������ �ݾ� ������ �����ϴ� ����Ʋ�� �ö󰣴�.)


//1�� �ڵ� 
//������ : ������ 100�� �߰�(���� ���� : pos ���)
//���� ��Ը� ���� : ��ǰ���� �Ǹ� ������ ���� ���� ���� �ִ�.
//������ �߰� �ɶ����� ���� �Լ��� ���� �߰��� �Ѵ� �� �ڵ带 �����ϼ���
class appliances{
	protected int price;
	protected int appPoint;
	
	public appliances(int price){
		this.price = price;
		this.appPoint = (int)(this.price/10.0);
	}
	public void appPointin() {
	}
}
class Tv3 extends appliances{
	public Tv3() {
		super(30000);
	}
	@Override
	public String toString(){
		return "TV";
	}
}
class Audio extends appliances{
	public Audio() {
		super(3000);
	}
	@Override
	public String toString(){
		return "Audio";
	}
	
}
class Computer extends appliances{
	public Computer() {
		super(25000);
	}
	@Override
	public String toString(){
		return "Coputer";
	}
}
//class Product extends appliances{
//	String produc;
//	public Product(int su , String produc) {
//		super(su);
//		this.produc = produc;
//	}
//	@Override
//	public String toString(){
//		return produc;
//	}
//}

class Buyer{
	int money = 50000;
	int appPint = 0;
	void Buy(appliances n){
		if(this.money <n.price){
			System.out.println("���� �ܾ��� �����մϴ�.");
			return;
		}
		//�Ǳ��� ����
		this.money -= n.price;
		this.appPint += n.appPoint;
		System.out.println("������ ���� :"+ n.toString());
	}
}
//2�� 
//	void Buy(Tv3 n){
//		if(this.money <n.price){
//			System.out.println("���� �ܾ��� �����մϴ�.");
//			return;
//		}
//		//�Ǳ��� ����
//		this.money -= n.price;
//		this.appPint += n.appPoint;
//		System.out.println("������ ���� :"+ n.toString());
//	}
//	void Buy(Audio n){
//		if(this.money <n.price){
//			System.out.println("���� �ܾ��� �����մϴ�.");
//			return;
//		}
//		//�Ǳ��� ����
//		this.money -= n.price;
//		this.appPint += n.appPoint;
//		System.out.println("������ ���� :"+ n.toString());
//	}
//	
//	void Buy(Computer n){
//		if(this.money <n.price){
//			System.out.println("���� �ܾ��� �����մϴ�.");
//			return;
//		}
//		//�Ǳ��� ����
//		this.money -= n.price;
//		this.appPint += n.appPoint;
//		System.out.println("������ ���� :"+ n.toString());
//	}
//}


/*class Buyer {
	int money = 50000;
	int appPint = 0;
	
	//��������
	//��������(������ ����: �ܾ�, ����Ʈ)
	//�������� ���� ���� (���ǰ�ü�� �Ķ���ͷ� �ޱ�
	void Tvbuy(Tv3 n){
		if(this.money <n.price){
			System.out.println("���� �ܾ��� �����մϴ�.");
			return;
		}
		//�Ǳ��� ����
		this.money -= n.price;
		this.appPint += n.appPoint;
		System.out.println("������ ���� :"+ n.toString());
	}
	void AudioBuy(Audio n){
		if(this.money <n.price){
			System.out.println("���� �ܾ��� �����մϴ�.");
			return;
		}
		//�Ǳ��� ����
		this.money -= n.price;
		this.appPint += n.appPoint;
		System.out.println("������ ���� :"+ n.toString());
	}
	
	void ComputerBuy(Computer n){
		if(this.money <n.price){
			System.out.println("���� �ܾ��� �����մϴ�.");
			return;
		}
		//�Ǳ��� ����
		this.money -= n.price;
		this.appPint += n.appPoint;
		System.out.println("������ ���� :"+ n.toString());
	}
}*/
//2�� �ڵ�
//tip) ���� �Լ��� �̸��� �����ϰ� (buy) �ϴ� �����ϳ��� ��� ����...
//�Լ� �̸� �����ϰ�(buy ) > Audio , Notebook , Tv�� ��� �ְ�
//overloading

//3�� �ڵ� ���� 
//1. �ټ��� ������ �԰� �Ǿ������� �Լ��� �ڵ� �߰��ϴ� ����
//2. �ݺ����� �ڵ带 ����
//�������� ����ϸ� ������ 100�� (Buy �Լ� 100��) 500 Line
//500���� > 10���� ����

//class AppPint{
//	int appPint;
//	public AppPint(int appPint) {
//		this.appPint = appPint / 10;
//	}
//}

public class Ex13_poly_main {
	public static void main(String[] args) {
		Tv3 tv = new Tv3();
		System.out.println("��ǰ�̸� :"+ tv.toString());
		System.out.println(tv.price);
		System.out.println(tv.appPoint);

		Audio au = new Audio();
		System.out.println("��ǰ�̸� :"+ au.toString());
		System.out.println(au.price);
		System.out.println(au.appPoint);
		
		Computer co = new Computer();
		System.out.println("��ǰ�̸� :"+ co.toString());
		System.out.println(co.price);
		System.out.println(co.appPoint);
		
//		Product pr = new Product(5000, "��Ʈ��");
		Buyer buyer = new Buyer();
//		buyer.Tvbuy(tv);
//		buyer.AudioBuy(au);
//		buyer.ComputerBuy(co);
//		buyer.Buy(pr);
		buyer.Buy(tv);
		buyer.Buy(au);
		buyer.Buy(co);
	}
}
