//객체지향 언어
// 상속, 캡슐화,  다향성(*)

//java: A extends B
//class my extends father
//Tip : c#  A:B
//class my : father

//상속 규칙
//1. 다중 상속 불가
//2. 단일 상속 원칙(계충적 상속: 여러개의 클래스 상속)
//3. extends(확장)
//단 interface 다중상속 가능

//상속의 진정한 의미: 재사용성
//재사용 -> 설계자 -> 자원들의 공통분모 만드는것



class GrandFather{
	public int gmoney = 5000;
	
	private int pmoney = 10000;
	
	
	public int getPmoney() {
		return pmoney;
	}

	public void Gmethod(){
		System.out.println("Gmethod");
	}
	public GrandFather(){
		System.out.println("할아버지");
	}
	
}
class Father extends GrandFather{
	public int fmoney = 10000;
	public Father() {
		System.out.println("아버지");
	}
	public void fmethod(){
		System.out.println("fmethod");
	}
}
class Child extends Father{
	public int cmoney =10;
	public Child() {
		System.out.println("자식");
	}
}
class my{
	
}
//my m = new my();
//사용자가 생성하는 모든 클래스는 java root class Object 클래스를 default 상속 합니다.
class you extends Object{//ok 명시해도 되는데 (굳이 만들 필요 없음)
	
}


public class Ex01_inheritane {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("할아버지 :"+ c.gmoney);
		System.out.println("아버지 :"+ c.fmoney);
		System.out.println("자식 :"+ c.cmoney);
		
		//상속 heep 올라가는 순서: 부모부터 .. (생성자 증명)
		
		my m = new my();
		//Object 상속 관계 설명
		
		//최상위 클래스가 Object 상속 받는 구조
		//GrandFather_extends Object

		//c.pmoney = 100; (직접 접근 불가)
		//getter 사용
		System.out.println(c.getPmoney());
		c.Gmethod();
		c.fmethod();
	}
}
