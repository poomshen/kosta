//스타크래프트 (게임)
//유닛
abstract class Unit{
	int x, y;
	void stop(){
		System.out.println("stop");
	}
	abstract void move(int x, int y);//move 강제 구현해라
}
class Tank  extends Unit{
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank x좌표 :" + this.x + " y좌표 :" +this.y );
	}
	
	//Tank 특수(구체화)
	void ChangeMode(){
		System.out.println("탱크 변환 모드");
		
	}
	
}
class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine x좌표 :" + this.x + " y좌표 :" +this.y );
	}
	//특수화 (구체화)
	void stimpack(){
		System.out.println("스팀팩가능");
	}
}
class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip x좌표 :" + this.x + " y좌표 :" +this.y );
	}
	
	//특수화 (구체화)
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
		//탱트 3대를 만들고 같은 좌표로 이동 시키세요
		Tank []t2 = new Tank[]{new Tank(),new Tank(), new Tank()};
//		for(Tank ta : t2){
//			ta.move(200,100);
//		}
		GuMove gu = new GuMove();
		gu.aray(t);
		gu.aray(m);
		gu.aray(m);
		gu.move(500, 100);
		//문제 
		//여러개의 유닛을 가지고 있다. (탱크 마린 드랍쉽)
		//3개의 같은 좌표점으로 이동하게 하세요
		//hint : 다형성
		//부모가 유닛이다.
//		Object []ob = new Object[5];
		
	}
}
