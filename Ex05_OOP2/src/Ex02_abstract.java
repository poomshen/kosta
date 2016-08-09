//��Ÿũ����Ʈ (����)
//����
abstract class Unit{
	int x, y;
	void stop(){
		System.out.println("stop");
	}
	abstract void move(int x, int y);//move ���� �����ض�
}
class Tank  extends Unit{
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank x��ǥ :" + this.x + " y��ǥ :" +this.y );
	}
	
	//Tank Ư��(��üȭ)
	void ChangeMode(){
		System.out.println("��ũ ��ȯ ���");
		
	}
	
}
class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine x��ǥ :" + this.x + " y��ǥ :" +this.y );
	}
	//Ư��ȭ (��üȭ)
	void stimpack(){
		System.out.println("�����Ѱ���");
	}
}
class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip x��ǥ :" + this.x + " y��ǥ :" +this.y );
	}
	
	//Ư��ȭ (��üȭ)
	void loas(){
		System.out.println("Unit load");
	}
	void unload(){
		System.out.println("Unit unload");
	}
}
class GuMove extends Unit{
	Unit [] un = new Unit[3];
	int su = 0;
	void aray(Unit un1) {
		un[su]= un1;
		su++;
	}
	@Override
	void move(int x, int y) {
		for(int i = 0; i<su ; i++){
			un[i].move(x, y);
		}
	}
	
}
public class Ex02_abstract {

	public static void main(String[] args) {
		
		Tank t = new Tank();
//		t.move(100, 200);
//		t.stop();
//		t.ChangeMode();
		Marine m= new Marine();
//		m.move(120, 220);
//		m.stop();
//		m.stimpack();
		//��Ʈ 3�븦 ����� ���� ��ǥ�� �̵� ��Ű����
		Tank []t2 = new Tank[]{new Tank(),new Tank(), new Tank()};
//		for(Tank ta : t2){
//			ta.move(200,100);
//		}
		GuMove gu = new GuMove();
		gu.aray(t);
		gu.aray(m);
		gu.aray(m);
		gu.move(500, 100);
		//���� 
		//�������� ������ ������ �ִ�. (��ũ ���� �����)
		//3���� ���� ��ǥ������ �̵��ϰ� �ϼ���
		//hint : ������
		//�θ� �����̴�.
//		Object []ob = new Object[5];
		
	}
}
