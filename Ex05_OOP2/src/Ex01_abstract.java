//추상 클래스(abstract class)
//미완성 설계도 (완성된 코드 +미완성 코드)
//미완성 코드(미완성된 매서드 : 실행블럭 (x) > {}(x) 없음
//추상메서드 > abstract method :
//ex) void move(){} > void move();(추상메서드)

//1.추상 클래스는 스스로 객체생성 불가(미완성이기 때문)
// ex ) abstract class Emp(추상  메서드)  > Emp e = new EMP();(x)
//2.추상 클래스는 상속을 통해서만 사용가능
// ex) class person extends Emp{}
//3.상속을 통해서 미완성된 메서드를 완성해라(추상 메서드를 구현해라)
//추상 메서드  상속받은 클래스에(Override 해라) (재정의)

//why: 목적 :설계자 입자에 강제적 구현부여 해라

abstract class abclass{
	int pos;
	void run(){
		pos++;
	}
	
	abstract void stop();//(실행 블럭만 제거 하면 추상 자원이된다.)
	
}
class child extends abclass{

	@Override
	void stop() {
		System.out.println("stop");
		
	}
	
}
public class Ex01_abstract {
	public static void main(String[] args) {
		child c  = new child();
		System.out.println(c.pos);
		c.run();
		System.out.println(c.pos);
		c.stop();
		
		//abclass ab = new abclass(); 객체 정보
	}
}
