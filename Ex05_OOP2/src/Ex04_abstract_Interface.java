/*
[공통점]
1.재정의 통한 강제 구현이 목적 
2.스스로 객체 생성이 불가능하다(직접 new x)
3.상속관계에서만 사용가능하다.

[다른점]
1.추상클래스(단일상속) : 인터페이스는 다중구현 (상속) 가능
2.추상클래스(완성된 코드 + 미완성 코드) : 인터페이스는 미완성 (단 static 상수 제외)

예외
[인터페이스] 끼리 상속(0)
interface IA extends IB,IC,ID {}
class Test implements IA, IB, IC, ID

JAVA API(수많은 인터페이스를 제공)
샘플) Comparable를 제공
class T implements Comparable{
	@Override
	public int compareTo(Object arg0) {
		//사용하는 우리가 구현
		int result = 0;
		if(arg0 = Object){
			result = 100;
		}
		return 0;
	}
	
}

인터페이스: 다형성 : 인터페이스도 타입이다.
서로 연관이 없는 클래스에 대해서 하나로 묶을 수 있는 기반을 제공

*/
//게임 
//수리할수 있는 
//유닛 : 지상, 공중

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
	//추가 (구체,특수화)
	
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
	//추가 (구체, 특수)
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
	///Scv 만이 가지는 특수화(구체화)
	//수리기능
	//다형성 (탱크나 마린 > 지상유닛
//	void Repair(GroundUnit unit){
//		//충전 (this.hitpoint 를 MAX_HP 만큼 충전)
//	}
	//문제점 : 수리가 되지 않는 마린이 함수에 들어 오는 자원이 된다.
	//문제점해결 방안: 인터페이스를 사용 -> 같은 타입(같은 조상)으로 묶어 주는 역할 
	// 문제점 유지보수(캐스팅_인터페이스 만 보여짐)
	//Irepairable 자기 자원이 없어서
	//repair  주소로 접근해서 수리 할 방법이 없다.
	//문제 해결 : downcasting 사용
	void Repair(Irepairable repair){
//		Tank2 t = (Tank2)repair;
//		t.hitpoint = t.MAX_HP;//충전
//		
//		Scv s = (Scv)repair;
//		s.hitpoint = s.MAX_HP;//충전
		
		if(repair instanceof Unit2){
			GroundUnit un = (GroundUnit)repair;
			if(un.hitpoint != un.MAX_HP){
				un.hitpoint++;
			}else{
				System.out.println("충전이 완료");
			}
		}else{
			System.out.println("unit2 가 아닙니다.");
		}
		//그런데 어떤 Unit 올지 알수 없는 상황에서 위...문제
	}
	
}

public class Ex04_abstract_Interface {
  public static void main(String[] args) {
	  Tank2 tank = new Tank2();
	  Marine2 marine2 = new Marine2();
	  Scv scv = new Scv();
	  
	  tank.hitpoint -= 2;
	  System.out.println("탱크전투 :" +tank.hitpoint);
	  scv.Repair(tank);
	  System.out.println("탱크충전 :" +tank.hitpoint);
	  scv.Repair(tank);
	  System.out.println("탱크충전 :" +tank.hitpoint);
	  
//	  scv.Repair(marine2); complie error 마린은 Irepairable를 구현하지 않았기 때문에
	  CommandCenter center =new CommandCenter();
	  scv.Repair(center);
  }
}
