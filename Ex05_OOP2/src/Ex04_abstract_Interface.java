/*
[������]
1.������ ���� ���� ������ ���� 
2.������ ��ü ������ �Ұ����ϴ�(���� new x)
3.��Ӱ��迡���� ��밡���ϴ�.

[�ٸ���]
1.�߻�Ŭ����(���ϻ��) : �������̽��� ���߱��� (���) ����
2.�߻�Ŭ����(�ϼ��� �ڵ� + �̿ϼ� �ڵ�) : �������̽��� �̿ϼ� (�� static ��� ����)

����
[�������̽�] ���� ���(0)
interface IA extends IB,IC,ID {}
class Test implements IA, IB, IC, ID

JAVA API(������ �������̽��� ����)
����) Comparable�� ����
class T implements Comparable{
	@Override
	public int compareTo(Object arg0) {
		//����ϴ� �츮�� ����
		int result = 0;
		if(arg0 = Object){
			result = 100;
		}
		return 0;
	}
	
}

�������̽�: ������ : �������̽��� Ÿ���̴�.
���� ������ ���� Ŭ������ ���ؼ� �ϳ��� ���� �� �ִ� ����� ����

*/
//���� 
//�����Ҽ� �ִ� 
//���� : ����, ����

interface Irepairable{
	
}
class Unit2{
	int hitpoint ;
	final int MAX_HP;
	public Unit2(int hp) {
		this.MAX_HP = hp;
	}
}

class GroundUnit extends Unit2{
	public GroundUnit(int hp) {
		super(hp);
	}
	//�߰� (��ü,Ư��ȭ)
	
}
class AirUnit extends Unit2 {

	public AirUnit(int hp) {
		super(hp);
	}
	
}
class Tank2 extends GroundUnit implements Irepairable{//Tank2 t = new Tank2();
	public Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString(){
		return "Tank2";
	}
	//�߰� (��ü, Ư��)
}
class Marine2 extends GroundUnit {
	public Marine2() {
		super(30);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString(){
		return "Marine2";
	}
}

class CommandCenter implements Irepairable{
	
}
class Scv extends GroundUnit implements Irepairable{
	public Scv() {
		super(40);
		this.hitpoint = this.MAX_HP;
	}
	///Scv ���� ������ Ư��ȭ(��üȭ)
	//�������
	//������ (��ũ�� ���� > ��������
//	void Repair(GroundUnit unit){
//		//���� (this.hitpoint �� MAX_HP ��ŭ ����)
//	}
	//������ : ������ ���� �ʴ� ������ �Լ��� ��� ���� �ڿ��� �ȴ�.
	//�������ذ� ���: �������̽��� ��� -> ���� Ÿ��(���� ����)���� ���� �ִ� ���� 
	// ������ ��������(ĳ����_�������̽� �� ������)
	//Irepairable �ڱ� �ڿ��� ���
	//repair  �ּҷ� �����ؼ� ���� �� ����� ����.
	//���� �ذ� : downcasting ���
	void Repair(Irepairable repair){
//		Tank2 t = (Tank2)repair;
//		t.hitpoint = t.MAX_HP;//����
//		
//		Scv s = (Scv)repair;
//		s.hitpoint = s.MAX_HP;//����
		
		if(repair instanceof Unit2){
			GroundUnit un = (GroundUnit)repair;
			if(un.hitpoint != un.MAX_HP){
				un.hitpoint++;
			}else{
				System.out.println("������ �Ϸ�");
			}
		}else{
			System.out.println("unit2 �� �ƴմϴ�.");
		}
		//�׷��� � Unit ���� �˼� ���� ��Ȳ���� ��...����
	}
	
}

public class Ex04_abstract_Interface {
  public static void main(String[] args) {
	  Tank2 tank = new Tank2();
	  Marine2 marine2 = new Marine2();
	  Scv scv = new Scv();
	  
	  tank.hitpoint -= 2;
	  System.out.println("��ũ���� :" +tank.hitpoint);
	  scv.Repair(tank);
	  System.out.println("��ũ���� :" +tank.hitpoint);
	  scv.Repair(tank);
	  System.out.println("��ũ���� :" +tank.hitpoint);
	  
//	  scv.Repair(marine2); complie error ������ Irepairable�� �������� �ʾұ� ������
	  CommandCenter center =new CommandCenter();
	  scv.Repair(center);
  }
}
