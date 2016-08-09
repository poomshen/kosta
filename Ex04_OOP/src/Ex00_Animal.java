
class Animal{
	Body body;
	String animalname;
	String habitat;
	
}
//������
class Mammal extends Animal{
	public void milk(){
		System.out.println("������ �Դ´�.");
	}
	public void bringForth(){
		System.out.println("������ ���´�.");
	}
	
}
//����
class Current extends Animal{ 
	
	public void fiy(){  System.out.println( "�ϴ��� ���� �ִ�");  };
	public void food(){
		System.out.println("���̸� �Դ´�.");
	}
	public void spawn(){
		System.out.println("���� ����");
	}
}
//��
class Dog extends Mammal{
	String pet ="�ֿϵ����̴�.";
	String smell ="������ �� �ô´�.";
	public Dog() {
		body = new Body(2,"���� �����ִ�","����",4);
		this.habitat = "��";
		this.animalname = "������";
	}
	public void pint(){
		System.out.println(this.animalname+"�� "+habitat+"�� ��� "+this.pet+"�̸� "+this.smell+"");
		body.Aprint();
		milk();
		bringForth();
	}
}
//����
class Dolphin extends Mammal{
	String iq ="����ť�� ����";
	String swimming ="������ ���Ѵ�.";
	public Dolphin(){
		body = new Body(2,"���� �θ�ó�� �����ִ�","�ִ��� �𸣰ڴ�",0);
		this.habitat = "�ٴ�";
		this.animalname = "����";
	}
	public void pint(){
		System.out.println(this.animalname+"�� "+habitat+"�� ��� "+this.iq+"�̸� "+this.swimming+"");
		body.Aprint();
		milk();
		bringForth();
	}
}
//������
class Eagle extends Current{
	String baldhead ="��Ӹ���";
	public Eagle() {
		body = new Body(2,"�θ��� ��ī�Ӱ��ִ�","����?",2);
		this.habitat = "�ϴ�";
		this.animalname = "������";
	}
	public void pint(){
		System.out.println(this.animalname+"��  "+habitat+"�� ��� "+this.baldhead+"�̸�");
		body.Aprint();
		spawn();
		food();
	}
}
//����
class Duck extends Current{
	String swimming ="������ ���Ѵ�.";
	String webbed ="�������� �ִ�";
	public Duck(){
		body = new Body(2,"�θ��� �����ִ�","���� �ʴ�",2);
		this.habitat = "ȣ��";
		this.animalname = "����";
	}
	public void pint(){
		System.out.println(this.animalname+"�� "+habitat+"�� ��� "+this.webbed+" ,"+this.swimming+"");
		body.Aprint();
		spawn();
		food();
	}
}
class Body{
	public int snow;
	public String mouth;
	public String nose;
	public int leg;
	
	public Body() {
		snow = 2; mouth ="�̻��̳�ī�Ӵ�."; nose ="�˴�"; leg = 2;
	}
	public Body(int snow ,String mouth , String nose , int leg){
		this.snow = snow;
		this.mouth =mouth;
		this.nose = nose;
		this.leg = leg;
	}
	public void Aprint(){
		System.out.println("�� :"+this.snow+" /�� :"+this.nose+"/�� :"+this.mouth +"/�ٸ�:"+this.leg );
	}
	
}
public class Ex00_Animal {

public static void main(String[] args) {
	Dog dog = new Dog();
	
	dog.pint();
		
	Duck duck = new Duck();
	duck.pint();
	
	Dolphin doiphin =new Dolphin();
	doiphin.pint();
	
	Eagle  eagle = new Eagle();
	eagle.pint();
}	
}
