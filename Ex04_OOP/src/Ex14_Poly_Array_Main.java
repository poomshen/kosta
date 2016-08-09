class appliances2{
	protected int price;
	protected int appPoint;
	
	public appliances2(int price){
		this.price = price;
		this.appPoint = (int)(this.price/10.0);
	}
}
class Tv4 extends appliances2{
	public Tv4() {
		super(30000);
	}
	@Override
	public String toString(){
		return "TV";
	}
}
class Audio2 extends appliances2{
	public Audio2() {
		super(3000);
	}
	@Override
	public String toString(){
		return "Audio";
	}
	
}
class Computer2 extends appliances2{
	public Computer2() {
		super(25000);
	}
	@Override
	public String toString(){
		return "Coputer";
	}
}

//������
class Buyer2 {
	int money;
	int appPoint;
	public Buyer2() {
		this.money = 1000;
		this.appPoint  = 0;
	}
	public Buyer2(int money,int appPoint){
		this.money = money;
		this.appPoint =appPoint;
	}
	//�䱸����
	//��ٱ��� ���(Cart)
	//��ٱ��� (���忡 �ִ� ������ǰ�� ��� ���� �� �ִ�) :POINT
	//��: ������ , �迭
	//��ٱ����� ũ��� �����Ǿ� �ִ�.
	appliances2 [] gi = new appliances2[10];
	int su =0;
	int to1 =0 ;
	int to2 =0;
	String to3 = "";
	void Buy(appliances2 ap){
		
		gi[su] = ap;
		su++;
//		//īƮ�� ��°� (���� �ڵ� ����)

		//�Ǳ��� ����
		for(int i = 0 ; i<su; i++ ){
			to1 += gi[i].price;
			to2 += gi[i].appPoint;
			to3 += gi[i].toString()+" ";
		}
		System.out.println("******************************");
		System.out.println("��ٱ����� ���� ���� ���� :"+ to1);
		System.out.println("��ٱ����� ���� ���� �� �޴�����Ʈ:"+ to2);
		System.out.println("��ٱ����� ���� ���� : "+ to3 + " ");
		System.out.println("******************************");
		to1 =0 ;
		to2 =0;
		to3 = "";
	}
	//����(��ٱ���)
	//��ٱ��� ��� ���� ���
	//������ �Ѿ�
	//������ ��� ���
	void sumary(){
		for(int i =0 ; i<su ; i++){
			if(su !=0 ){
				if(this.money+this.appPoint <gi[i].price){
					System.out.println("���� �ܾ��� �����մϴ�.");
					return;
				}
				//�Ǳ��� ����
				if(this.money < gi[i].price){
				  int su2 =  gi[i].price - this.money;
				  System.out.println("����Ʈ�� ����ؼ� ���� �Ǽ̽��ϴ�.");
				  this.money = 0;
				  this.appPoint -= su2;
				  this.appPoint += gi[i].appPoint;
				}else{
					this.money -= gi[i].price;
					this.appPoint += gi[i].appPoint;
				}
				System.out.println("������ ���� :"+ gi[i].toString());
				System.out.println("���� �ܾ� :"+this.money);
				System.out.println("���� ����Ʈ :"+this.appPoint);
			}else{
				System.out.println("�����Ͻ� ������ �����ϴ�.");
			}
		}
		
	}
}


public class Ex14_Poly_Array_Main {
	public static void main(String[] args) {
		Tv4 tv = new Tv4();
		System.out.println("��ǰ�̸� :"+ tv.toString());
		System.out.println("��ǰ���� :"+ tv.price);
		System.out.println("��ǰ����Ʈ" + tv.appPoint);

		Audio2 au = new Audio2();
		System.out.println("��ǰ�̸� :"+ au.toString());
		System.out.println("��ǰ���� :"+au.price);
		System.out.println("��ǰ����Ʈ" +au.appPoint);
		
		Computer2 co = new Computer2();
		System.out.println("��ǰ�̸� :"+ co.toString());
		System.out.println("��ǰ���� :"+co.price);
		System.out.println("��ǰ����Ʈ" +co.appPoint);
		
//		Product pr = new Product(5000, "��Ʈ��");
		Buyer2 buyer = new Buyer2(50000,500000);
//		buyer.Tvbuy(tv);
//		buyer.AudioBuy(au);
//		buyer.ComputerBuy(co);
//		buyer.Buy(pr);
		buyer.Buy(tv);
		buyer.Buy(au);
		buyer.Buy(co);
		buyer.sumary();
	}
}
